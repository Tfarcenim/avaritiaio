package com.tfar.avaritiaio.capacitor;

import com.enderio.core.client.handlers.SpecialTooltipHandler;
import com.tfar.avaritiaio.items.ItemBase;
import crazypants.enderio.base.lang.Lang;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;


public class ItemAvaritiaIOCapacitor extends ItemBase {
    public ItemAvaritiaIOCapacitor(String name) {
        super(name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(@Nonnull ItemStack stack, @Nullable World worldIn, @Nonnull List<String> tooltip, @Nonnull ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(Lang.MACHINE_UPGRADE.get());
        if (SpecialTooltipHandler.showAdvancedTooltips()) {
            SpecialTooltipHandler.addDetailedTooltipFromResources(tooltip, Lang.MACHINE_UPGRADE.getKey());
        } else {
            SpecialTooltipHandler.addShowDetailsTooltip(tooltip);
        }
    }
}
