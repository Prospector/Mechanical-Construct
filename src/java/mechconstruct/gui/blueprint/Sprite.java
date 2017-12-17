package mechconstruct.gui.blueprint;

import mechconstruct.gui.GuiAssembler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Sprite implements ISprite {
	public static final Sprite SLOT_NORMAL = new Sprite(GuiAssembler.MECH_ELEMENTS, 0, 0, 18, 18);
	public static final Sprite CHARGE_SLOT_ICON = new Sprite(GuiAssembler.MECH_ELEMENTS, 18, 0, 18, 18);
	public static final Sprite DISCHARGE_SLOT_ICON = new Sprite(GuiAssembler.MECH_ELEMENTS, 36, 0, 18, 18);
	public static final Sprite ENERGY_BAR = new Sprite(GuiAssembler.MECH_ELEMENTS, 0, 18, 12, 40);
	public static final Sprite ENERGY_BAR_BACKGROUND = new Sprite(GuiAssembler.MECH_ELEMENTS, 12, 18, 14, 42);
	public static final Sprite TOP_ENERGY_BAR = new Sprite(GuiAssembler.MECH_ELEMENTS, 0, 215, 167, 2);
	public static final Sprite TOP_ENERGY_BAR_BACKGROUND = new Sprite(GuiAssembler.MECH_ELEMENTS, 0, 217, 169, 3);
	public static final Sprite LEFT_TAB = new Sprite(GuiAssembler.MECH_ELEMENTS, 0, 86, 23, 26);
	public static final Sprite LEFT_TAB_SELECTED = new Sprite(GuiAssembler.MECH_ELEMENTS, 0, 60, 29, 26);
	public static final Sprite CONFIGURE_ICON = new Sprite(GuiAssembler.MECH_ELEMENTS, 26, 18, 16, 16);
	public static final Sprite REDSTONE_DISABLED_ICON = new Sprite(new ItemStack(Items.GUNPOWDER));
	public static final Sprite REDSTONE_LOW_ICON = new Sprite(new ItemStack(Items.REDSTONE));
	public static final Sprite REDSTONE_HIGH_ICON = new Sprite(new ItemStack(Blocks.REDSTONE_TORCH));
	public static final Sprite UPGRADE_ICON = new Sprite(GuiAssembler.MECH_ELEMENTS, 26, 34, 16, 16);
	public static final Sprite ENERGY_ICON = new Sprite(GuiAssembler.MECH_ELEMENTS, 46, 19, 9, 13);
	public static final Sprite ENERGY_ICON_EMPTY = new Sprite(GuiAssembler.MECH_ELEMENTS, 62, 19, 9, 13);
	public static final Sprite JEI_ICON = new Sprite(GuiAssembler.MECH_ELEMENTS, 42, 34, 16, 16);

	public final ResourceLocation textureLocation;
	public final int x;
	public final int y;
	public final int width;
	public final int height;
	public int offsetX = 0;
	public int offsetY = 0;
	public ItemStack itemStack;

	public Sprite(ResourceLocation textureLocation, int x, int y, int width, int height) {
		this.textureLocation = textureLocation;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.itemStack = null;
	}

	public Sprite(ItemStack stack) {
		this.textureLocation = null;
		this.x = -1;
		this.y = -1;
		this.width = -1;
		this.height = -1;
		this.itemStack = stack;
	}

	public boolean hasStack() {
		return itemStack != null;
	}

	public boolean hasTextureInfo() {
		return x >= 0 && y >= 0 && width >= 0 && height >= 0;
	}

	public Sprite setOffsetX(int offsetX) {
		this.offsetX = offsetX;
		return this;
	}

	public Sprite setOffsetY(int offsetY) {
		this.offsetY = offsetY;
		return this;
	}

	@Override
	public Sprite getSprite(IBlueprintProvider provider) {
		return this;
	}
}