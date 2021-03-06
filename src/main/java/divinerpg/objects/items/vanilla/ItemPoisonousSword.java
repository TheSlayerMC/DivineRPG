package divinerpg.objects.items.vanilla;

import java.util.List;

import divinerpg.objects.items.base.ItemModSword;
import divinerpg.utils.TooltipLocalizer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ItemPoisonousSword extends ItemModSword {
    private float poisonSeconds;

    public ItemPoisonousSword(ToolMaterial mat, String name, float seconds) {
        super(mat, name);
        this.poisonSeconds = seconds;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        if (entity instanceof EntityLivingBase)
            ((EntityLivingBase) entity)
                    .addPotionEffect(new PotionEffect(MobEffects.POISON, (int) (poisonSeconds * 20), 1));
        return false;
    }

    @Override
    protected void addAdditionalInformation(List list) {
        list.add(TooltipLocalizer.poison(this.poisonSeconds));
    }
}
