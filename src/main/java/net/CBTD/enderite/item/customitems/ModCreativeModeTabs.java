package net.CBTD.enderite.item.customitems;

import net.CBTD.enderite.Enderite;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Enderite.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ENDERITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("enderite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.ENDERITE_INGOT.get()))
                    .title(Component.translatable("creativetab.enderite.enderite_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // Ingredients
                        output.accept(ModItem.ENDERITE_INGOT.get());
                        output.accept(ModItem.ENDERITE_SCRAP.get());

                        // Weapons
                        output.accept(ModItem.ENDERITE_SWORD.get());
                        output.accept(ModItem.ENDERITE_MACE.get());

                        // Tools
                        output.accept(ModItem.ENDERITE_PICKAXE.get());
                        output.accept(ModItem.ENDERITE_AXE.get());
                        output.accept(ModItem.ENDERITE_HOE.get());

                    }).build());
}
