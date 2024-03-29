package io.ncbpfluffybear.fluffymachines;

import com.google.common.util.concurrent.ForwardingListenableFuture;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import io.ncbpfluffybear.fluffymachines.items.tools.PortableCharger;
import io.ncbpfluffybear.fluffymachines.items.tools.WarpPadConfigurator;
import io.ncbpfluffybear.fluffymachines.items.tools.WateringCan;
import io.ncbpfluffybear.fluffymachines.utils.FluffyItems;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Slime;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;
import java.awt.font.GlyphJustificationInfo;

public class ResearchSetup {
    public ResearchSetup(){
        register("Basic_machines", 0, "Basic Machines", 69, FluffyItems.WATER_SPRINKER, FluffyItems.AUTO_CRAFTING_TABLE, FluffyItems.AUTO_ENHANCED_CRAFTING_TABLE, FluffyItems.AUTO_TABLE_SAW, FluffyItems.AUTO_MAGIC_WORKBENCH, FluffyItems.AUTO_ARMOR_FORGE, FluffyItems.BACKPACK_LOADER, FluffyItems.BACKPACK_UNLOADER, FluffyItems.ELECTRIC_DUST_FABRICATOR, FluffyItems.ELECTRIC_DUST_RECYCLER);
        register("advanced_machines", 1, "Advanced Machines", 69, FluffyItems.AUTO_ANCIENT_ALTAR, FluffyItems.ADVANCED_AUTO_DISENCHANTER, FluffyItems.ADVANCED_CHARGING_BENCH, FluffyItems. ACB_UPGRADE_CARD, FluffyItems. SMART_FACTORY);
        register("Tools", 2, "Tools", 69, FluffyItems.WATERING_CAN, FluffyItems.SCYTHE, FluffyItems.PAXEL);
        register("multiblocks", 3, "MultiBlock Machines", 69, FluffyItems.FOUNDRY, FluffyItems.EXP_DISPENSER, FluffyItems.SUPERHEATED_FURNACE);
        register("crankgen", 4, "crankcore", 69, FluffyItems.CRANK_GENERATOR, FluffyItems.GENERATOR_CORE);
        register("baisc_charger", 5, "Basic Charger", 69, FluffyItems.SMALL_PORTABLE_CHARGER, FluffyItems.MEDIUM_PORTABLE_CHARGER);
        register("advanced_chargers", 6, "Advanced_chargers", 69, FluffyItems.BIG_PORTABLE_CHARGER, FluffyItems.LARGE_PORTABLE_CHARGER, FluffyItems.CARBONADO_PORTABLE_CHARGER);
        register("wrenchs", 7, "Wrenchs", 69, FluffyItems.FLUFFY_WRENCH, FluffyItems.REINFORCED_FLUFFY_WRENCH, FluffyItems.CARBONADO_FLUFFY_WRENCH);
        register("misc", 8, "Misc", 69, FluffyItems.FIREPROOF_RUNE, FluffyItems.DOLLY, FluffyItems.ANCIENT_BOOK, FluffyItems.WARP_PAD, FluffyItems.WARP_PAD_CONFIGURATOR, FluffyItems.ALTERNATE_ELEVATOR_PLATE);
    }

    @ParametersAreNonnullByDefault
    private static void register(String key, int id, String name, int defaultCost, SlimefunItemStack... items) {
        Research research = new Research(new NamespacedKey(FluffyMachines.getInstance(), key), id, name, defaultCost);

        for (SlimefunItemStack item : items) {

            research.addItems(item);
        }

        research.register();
    }
}