
package net.mcreator.whydoesntthiswork.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.whydoesntthiswork.WhydoesntthisworkModElements;

@WhydoesntthisworkModElements.ModElement.Tag
public class SpaghettiNoodlesItem extends WhydoesntthisworkModElements.ModElement {
	@ObjectHolder("whydoesntthiswork:spaghetti_noodles")
	public static final Item block = null;
	public SpaghettiNoodlesItem(WhydoesntthisworkModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(5).saturation(0.5f).build()));
			setRegistryName("spaghetti_noodles");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 40;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
