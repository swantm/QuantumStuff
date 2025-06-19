package net.swan.quantumstuff.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class QuantumBowItem extends BowItem {
    public QuantumBowItem(Properties properties) {
        super(properties);
    }

    @Override
    public void releaseUsing(ItemStack stack, Level level, LivingEntity entity, int timeLeft) {
        if (!(entity instanceof Player player)) return;

        float power = 1.0F; // Full power instantly

        ItemStack ammo = player.getProjectile(stack);
        if (ammo.isEmpty()) return;

        List<ItemStack> arrows = draw(stack, ammo, player);
        if (level instanceof ServerLevel serverLevel && !arrows.isEmpty()) {
            shoot(serverLevel, player, player.getUsedItemHand(), stack, arrows, power * 3.0F, 1.0F, true, null);
        }

        level.playSound(null, player.getX(), player.getY(), player.getZ(),
                SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS,
                1.0F, 1.0F / (level.getRandom().nextFloat() * 0.4F + 1.2F) + power * 0.5F);

        player.awardStat(Stats.ITEM_USED.get(this));
    }

    @Override
    public int getUseDuration(ItemStack stack, @Nullable LivingEntity entity) {
        return 4;  // Very short use duration for rapid shooting
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        boolean hasAmmo = !player.getProjectile(stack).isEmpty();

        var ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(stack, level, player, hand, hasAmmo);
        if (ret != null) return ret;

        // Use hasInfiniteMaterials instead of hasInfiniteAmmo
        if (!player.hasInfiniteMaterials() && !hasAmmo) {
            return InteractionResultHolder.fail(stack);
        } else {
            player.startUsingItem(hand);
            return InteractionResultHolder.consume(stack);
        }
    }
}
