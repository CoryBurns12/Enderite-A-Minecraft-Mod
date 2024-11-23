package net.CBTD.enderite.item.customitems;

import net.CBTD.enderite.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.ForgeTier;
import net.minecraft.world.item.crafting.Ingredient;

public class ModToolTiers {
    public static final Tier ENDERITE = new ForgeTier(2200, 4, 5f, 20,
            ModTags.Blocks.NEEDS_ENDERITE_TOOL, () -> Ingredient.of(ModItem.ENDERITE_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_ENDERITE);
}
