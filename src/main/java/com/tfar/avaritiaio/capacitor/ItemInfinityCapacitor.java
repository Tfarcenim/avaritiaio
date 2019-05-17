package com.tfar.avaritiaio.capacitor;


import com.enderio.core.common.CompoundCapabilityProvider;
import crazypants.enderio.api.capacitor.CapabilityCapacitorData;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ItemInfinityCapacitor extends ItemAvaritiaIOCapacitor  {

  public ItemInfinityCapacitor(String name) {
    super(name);
  }

  @Nullable
  @Override
  public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt) {
    ICapabilityProvider capProvider = new ICapabilityProvider() {
      /**
       * Determines if this object has support for the capability in question on the specific side.
       * The return value of this MIGHT change during runtime if this object gains or loses support
       * for a capability. It is not required to call this function before calling
       * {@link #getCapability(Capability, EnumFacing)}.
       * <p>
       * Basically, this method functions analogously to {@link Map#containsKey(Object)}.
       * <p>
       * <em>Example:</em>
       * A Pipe getting a cover placed on one side causing it lose the Inventory attachment function for that side.
       * </p><p>
       * This is a light weight version of getCapability, intended for metadata uses.
       * </p>
       *
       * @param capability The capability to check
       * @param facing     The Side to check from:
       *                   CAN BE NULL. Null is defined to represent 'internal' or 'self'
       * @return True if this object supports the capability. If true, then {@link #getCapability(Capability, EnumFacing)}
       * must not return null.
       */
      @Override
      public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == CapabilityCapacitorData.getCapNN();
      }

      /**
       * Retrieves the handler for the capability requested on the specific side.
       * <ul>
       * <li>The return value <strong>CAN</strong> be null if the object does not support the capability.</il>
       * <li>The return value <strong>CAN</strong> be the same for multiple faces.</li>
       * </ul>
       * <p>
       * Basically, this method functions analogously to {@link Map#get(Object)}.
       *
       * @param capability The capability to check
       * @param facing     The Side to check from,
       *                   <strong>CAN BE NULL</strong>. Null is defined to represent 'internal' or 'self'
       * @return The requested capability. Must <strong>NOT</strong> be null when {@link #hasCapability(Capability, EnumFacing)}
       * would return true.
       */
      @Nullable
      @Override
      public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        if (capability == CapabilityCapacitorData.getCapNN()) {
          return CapabilityCapacitorData.getCapNN().cast(AvaritiaIOCapacitorData.INFINITY_CAPACITOR);
        }
        return null;
      }
    };
    return new CompoundCapabilityProvider(super.initCapabilities(stack, nbt), capProvider);
  }
}




