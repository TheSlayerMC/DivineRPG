package divinerpg.registry;

import java.util.ArrayList;
import java.util.List;

import divinerpg.DivineRPG;
import divinerpg.dimensions.apalachia.ApalachiaTree;
import divinerpg.dimensions.eden.EdenTree;
import divinerpg.dimensions.mortum.MortumTree;
import divinerpg.dimensions.skythern.SkythernTree;
import divinerpg.dimensions.wildwood.WildWoodTree;
import divinerpg.enums.EnumBlockType;
import divinerpg.enums.ParticleType;
import divinerpg.enums.StatueType;
import divinerpg.enums.WoodType;
import divinerpg.objects.blocks.*;
import divinerpg.objects.blocks.arcana.*;
import divinerpg.objects.blocks.iceika.*;
import divinerpg.objects.blocks.twilight.*;
import divinerpg.objects.blocks.vanilla.*;
import divinerpg.objects.blocks.vethea.*;
import divinerpg.world.DivineTree;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
@ObjectHolder("divinerpg")
public class ModBlocks {
    private static int WOOD_GOLD = 0, STONE = 1, IRON = 2, DIAMOND = 3;
    private static List<Block> blockList = new ArrayList<Block>();
    // Vanilla dimensions

    // Ores
    @ObjectHolder("arlemite_ore")
    public static Block arlemiteOre = null;
    @ObjectHolder("realmite_ore")
    public static Block realmiteOre = null;
    @ObjectHolder("rupee_ore")
    public static Block rupeeOre = null;
    @ObjectHolder("bloodgem_ore")
    public static Block bloodgemOre = null;
    @ObjectHolder("netherite_ore")
    public static Block netheriteOre = null;

    // Compressed ore blocks
    @ObjectHolder("arlemite_block")
    public static Block arlemiteBlock = null;
    @ObjectHolder("realmite_block")
    public static Block realmiteBlock = null;
    @ObjectHolder("rupee_block")
    public static Block rupeeBlock = null;
    @ObjectHolder("bloodgem_block")
    public static Block bloodgemBlock = null;
    @ObjectHolder("netherite_block")
    public static Block netheriteBlock = null;

    // Mob pumpkins
    @ObjectHolder("blaze_pumpkin")
    public static Block blazePumpkin = null;
    @ObjectHolder("creeper_pumpkin")
    public static Block creeperPumpkin = null;
    @ObjectHolder("cyclops_pumpkin")
    public static Block cyclopsPumpkin = null;
    @ObjectHolder("ender_pumpkin")
    public static Block enderPumpkin = null;
    @ObjectHolder("ender_watcher_pumpkin")
    public static Block enderWatcherPumpkin = null;
    @ObjectHolder("frost_pumpkin")
    public static Block frostPumpkin = null;
    @ObjectHolder("ghast_pumpkin")
    public static Block ghastPumpkin = null;
    @ObjectHolder("glacon_pumpkin")
    public static Block glaconPumpkin = null;
    @ObjectHolder("hellspider_pumpkin")
    public static Block hellspiderPumpkin = null;
    @ObjectHolder("jungle_spider_pumpkin")
    public static Block jungleSpiderPumpkin = null;
    @ObjectHolder("skeleton_pumpkin")
    public static Block skeletonPumpkin = null;
    @ObjectHolder("spider_pumpkin")
    public static Block spiderPumpkin = null;
    @ObjectHolder("zombie_pumpkin")
    public static Block zombiePumpkin = null;

    // Torches
    @ObjectHolder("aqua_torch")
    public static Block aquaTorch = null;
    @ObjectHolder("skeleton_torch")
    public static Block skeletonTorch = null;

    // Decoration blocks

    // Steel
    @ObjectHolder("black_steel")
    public static Block blackSteel = null;
    @ObjectHolder("blue_steel")
    public static Block blueSteel = null;
    @ObjectHolder("bright_red_steel")
    public static Block brightRedSteel = null;
    @ObjectHolder("green_steel")
    public static Block greenSteel = null;
    @ObjectHolder("orange_steel")
    public static Block orangeSteel = null;
    @ObjectHolder("purple_steel")
    public static Block purpleSteel = null;
    @ObjectHolder("red_steel")
    public static Block redSteel = null;
    @ObjectHolder("teal_steel")
    public static Block tealSteel = null;
    @ObjectHolder("white_steel")
    public static Block whiteSteel = null;
    @ObjectHolder("yellow_steel")
    public static Block yellowSteel = null;

    // Vanes
    @ObjectHolder("blue_vane")
    public static Block blueVane = null;
    @ObjectHolder("cyan_vane")
    public static Block cyanVane = null;
    @ObjectHolder("purple_vane")
    public static Block purpleVane = null;
    @ObjectHolder("red_vane")
    public static Block redVane = null;
    @ObjectHolder("yellow_vane")
    public static Block yellowVane = null;

    // Bricks
    @ObjectHolder("aquatonic_bricks")
    public static Block aquatonicBricks = null;
    @ObjectHolder("arlemite_bricks")
    public static Block arlemiteBricks = null;
    @ObjectHolder("darkstone_bricks")
    public static Block darkstoneBricks = null;
    @ObjectHolder("diamond_bricks")
    public static Block diamondBricks = null;
    @ObjectHolder("gold_bricks")
    public static Block goldBricks = null;
    @ObjectHolder("green_bricks")
    public static Block greenBricks = null;
    @ObjectHolder("iron_bricks")
    public static Block ironBricks = null;
    @ObjectHolder("lapis_lazuli_bricks")
    public static Block lapisLazuliBricks = null;
    @ObjectHolder("lava_bricks")
    public static Block lavaBricks = null;
    @ObjectHolder("milk_stone_bricks")
    public static Block milkStoneBricks = null;
    @ObjectHolder("netherite_bricks")
    public static Block netheriteBricks = null;
    @ObjectHolder("pink_bricks")
    public static Block pinkBricks = null;
    @ObjectHolder("purple_bricks")
    public static Block purpleBricks = null;
    @ObjectHolder("realmite_bricks")
    public static Block realmiteBricks = null;
    @ObjectHolder("redstone_bricks")
    public static Block redstoneBricks = null;

    // Minibricks
    @ObjectHolder("minibricks")
    public static Block minibricks = null;
    @ObjectHolder("arlemite_minibricks")
    public static Block arlemiteMinibricks = null;
    @ObjectHolder("bedrock_minibricks")
    public static Block bedrockMinibricks = null;
    @ObjectHolder("bloodgem_minibricks")
    public static Block bloodgemMinibricks = null;
    @ObjectHolder("netherite_minibricks")
    public static Block netheriteMinibricks = null;
    @ObjectHolder("realmite_minibricks")
    public static Block realmiteMinibricks = null;
    @ObjectHolder("rupee_minibricks")
    public static Block rupeeMinibricks = null;

    // Lamps
    @ObjectHolder("aqua_lamp")
    public static Block aquaLamp = null;
    @ObjectHolder("arlemite_lamp")
    public static Block arlemiteLamp = null;
    @ObjectHolder("blaze_lamp")
    public static Block blazeLamp = null;
    @ObjectHolder("bluefire_lamp")
    public static Block bluefireLamp = null;
    @ObjectHolder("diamond_lamp")
    public static Block diamondLamp = null;
    @ObjectHolder("divine_lamp")
    public static Block divineLamp = null;
    @ObjectHolder("draken_lamp")
    public static Block drakenLamp = null;
    @ObjectHolder("eden_lamp")
    public static Block edenLamp = null;
    @ObjectHolder("ender_lamp")
    public static Block enderLamp = null;
    @ObjectHolder("ender_stone_lamp")
    public static Block enderStoneLamp = null;
    @ObjectHolder("gold_lamp")
    public static Block goldLamp = null;
    @ObjectHolder("ice_lamp")
    public static Block iceLamp = null;
    @ObjectHolder("jungle_lamp")
    public static Block jungleLamp = null;
    @ObjectHolder("kraken_lamp")
    public static Block krakenLamp = null;
    @ObjectHolder("lapis_lazuli_lamp")
    public static Block lapisLazuliLamp = null;
    @ObjectHolder("lava_lamp")
    public static Block lavaLamp = null;
    @ObjectHolder("milky_lamp")
    public static Block milkyLamp = null;
    @ObjectHolder("molten_lamp")
    public static Block moltenLamp = null;
    @ObjectHolder("netherite_lamp")
    public static Block netheriteLamp = null;
    @ObjectHolder("realmite_lamp")
    public static Block realmiteLamp = null;
    @ObjectHolder("redstone_ore_lamp")
    public static Block redstoneOreLamp = null;
    @ObjectHolder("rupee_lamp")
    public static Block rupeeLamp = null;
    @ObjectHolder("terran_lamp")
    public static Block terranLamp = null;

    // Powered fences
    @ObjectHolder("blue_fence")
    public static Block blueFence = null;
    @ObjectHolder("blue_fence_on")
    public static Block blueFenceOn = null;
    @ObjectHolder("green_fence")
    public static Block greenFence = null;
    @ObjectHolder("green_fence_on")
    public static Block greenFenceOn = null;
    @ObjectHolder("red_fence")
    public static Block redFence = null;
    @ObjectHolder("red_fence_on")
    public static Block redFenceOn = null;

    // Miscellaneous decorative blocks
    @ObjectHolder("asphalt")
    public static Block asphalt = null;
    @ObjectHolder("blue_stone")
    public static Block blueStone = null;
    @ObjectHolder("checker")
    public static Block checker = null;
    @ObjectHolder("crate")
    public static Block crate = null;
    @ObjectHolder("darkstone")
    public static Block darkstone = null;
    @ObjectHolder("fancy_wool")
    public static Block fancyWool = null;
    @ObjectHolder("milk_stone")
    public static Block milkStone = null;
    @ObjectHolder("plank_design")
    public static Block plankDesign = null;
    @ObjectHolder("rainbow_wool")
    public static Block rainbowWool = null;

    // Spike blocks
    @ObjectHolder("spike_block")
    public static Block spikeBlock = null;
    @ObjectHolder("hot_spike_block")
    public static Block hotSpikeBlock = null;

    // Utility blocks
    @ObjectHolder("altar_of_corruption")
    public static Block altarOfCorruption = null;
    @ObjectHolder("bone_chest")
    public static Block boneChest = null;

    // Divine blocks
    @ObjectHolder("divine_sapling")
    public static Block divineSapling = null;
    @ObjectHolder("divine_log")
    public static Block divineLog = null;
    @ObjectHolder("divine_leaves")
    public static Block divineLeaves = null;
    @ObjectHolder("divine_planks")
    public static Block divinePlanks = null;
    @ObjectHolder("divine_moss_stone")
    public static Block divineMossStone = null;
    @ObjectHolder("divine_rock")
    public static Block divineRock = null;

    // Miscellaneous utility
    @ObjectHolder("slime_light")
    public static Block slimeLight = null;
    @ObjectHolder("dark_bridge")
    public static Block darkBridge = null;

    // Crops
    @ObjectHolder("tomato_plant")
    public static Block tomatoPlant = null;
    @ObjectHolder("white_mushroom_plant")
    public static Block whiteMushroomPlant = null;

    // Boss statues
    @ObjectHolder("ancient_entity_statue")
    public static Block ancientEntityStatue = null;
    @ObjectHolder("ayeraco_statue")
    public static Block ayeracoStatue = null;
    @ObjectHolder("densos_statue")
    public static Block densosStatue = null;
    @ObjectHolder("dramix_statue")
    public static Block dramixStatue = null;
    @ObjectHolder("eternal_archer_statue")
    public static Block eternalArcherStatue = null;
    @ObjectHolder("karot_statue")
    public static Block karotStatue = null;
    @ObjectHolder("king_of_scorchers_statue")
    public static Block kingOfScorchersStatue = null;
    @ObjectHolder("parasecta_statue")
    public static Block parasectaStatue = null;
    @ObjectHolder("reyvor_statue")
    public static Block reyvorStatue = null;
    @ObjectHolder("soul_fiend_statue")
    public static Block soulFiendStatue = null;
    @ObjectHolder("the_watcher_statue")
    public static Block theWatcherStatue = null;
    @ObjectHolder("twilight_demon_statue")
    public static Block twilightDemonStatue = null;
    @ObjectHolder("vamacheron_statue")
    public static Block vamacheronStatue = null;

    // Liquid
    @ObjectHolder("tar")
    public static Block tar = null;

    // Ayeraco technical blocks
    @ObjectHolder("ayeraco_beam_blue")
    public static Block ayeracoBeamBlue = null;
    @ObjectHolder("ayeraco_beam_green")
    public static Block ayeracoBeamGreen = null;
    @ObjectHolder("ayeraco_beam_purple")
    public static Block ayeracoBeamPurple = null;
    @ObjectHolder("ayeraco_beam_red")
    public static Block ayeracoBeamRed = null;
    @ObjectHolder("ayeraco_beam_yellow")
    public static Block ayeracoBeamYellow = null;
    @ObjectHolder("ayeraco_spawn")
    public static Block ayeracoSpawn = null;

    // Iceika

    // Terrain
    @ObjectHolder("frozen_dirt")
    public static BlockModDirt frozenDirt = null;
    @ObjectHolder("frozen_grass")
    public static BlockModGrass frozenGrass = null;
    @ObjectHolder("frozen_stone")
    public static Block frozenStone = null;
    @ObjectHolder("frozen_log")
    public static Block frozenLog = null;
    @ObjectHolder("brittle_leaves")
    public static Block brittleLeaves = null;
    @ObjectHolder("frozen_planks")
    public static Block frozenPlanks = null;

    // Structure blocks
    @ObjectHolder("coalstone")
    public static Block coalstone = null;
    @ObjectHolder("coalstone_furnace")
    public static Block coalstoneFurnace = null;
    @ObjectHolder("coalstone_furnace_on")
    public static Block coalstoneFurnaceOn = null;
    @ObjectHolder("coalstone_stairs")
    public static Block coalstoneStairs = null;
    @ObjectHolder("frost_archer_spawner")
    public static Block frostArcherSpawner = null;
    @ObjectHolder("frosted_chest")
    public static Block frostedChest = null;
    @ObjectHolder("frosted_glass")
    public static Block frostedGlass = null;
    @ObjectHolder("icy_bricks")
    public static Block icyBricks = null;
    @ObjectHolder("icy_stone")
    public static Block icyStone = null;
    @ObjectHolder("rollum_spawner")
    public static Block rollumSpawner = null;
    @ObjectHolder("snow_bricks")
    public static Block snowBricks = null;
    @ObjectHolder("steel_door")
    public static Block steelDoor = null;
    @ObjectHolder("workshop_bookcase")
    public static Block workshopBookcase = null;
    @ObjectHolder("workshop_lamp")
    public static Block workshopLamp = null;

    // Candy canes
    @ObjectHolder("blue_candy_cane")
    public static Block blueCandyCane = null;
    @ObjectHolder("green_candy_cane")
    public static Block greenCandyCane = null;
    @ObjectHolder("pink_candy_cane")
    public static Block pinkCandyCane = null;
    @ObjectHolder("red_candy_cane")
    public static Block redCandyCane = null;
    @ObjectHolder("yellow_candy_cane")
    public static Block yellowCandyCane = null;

    // Christmas lights
    @ObjectHolder("blue_christmas_lights")
    public static Block blueChristmasLights = null;
    @ObjectHolder("green_christmas_lights")
    public static Block greenChristmasLights = null;
    @ObjectHolder("purple_christmas_lights")
    public static Block purpleChristmasLights = null;
    @ObjectHolder("red_christmas_lights")
    public static Block redChristmasLights = null;
    @ObjectHolder("yellow_christmas_lights")
    public static Block yellowChristmasLights = null;

    // Chest
    @ObjectHolder("present_box")
    public static Block presentBox = null;

    // Crops
    @ObjectHolder("winterberry_bush")
    public static Block winterberryBush = null;
    @ObjectHolder("ripe_winterberry_bush")
    public static Block ripeWinterberryBush = null;

    // Other
    @ObjectHolder("iceika_fire")
    public static Block iceikaFire = null;
    @ObjectHolder("iceika_portal")
    public static BlockModPortal iceikaPortal = null;

    // Twilight dimensions

    // Dirt
    @ObjectHolder("eden_dirt")
    public static BlockModDirt edenDirt = null;
    @ObjectHolder("wildwood_dirt")
    public static BlockModDirt wildwoodDirt = null;
    @ObjectHolder("apalachia_dirt")
    public static BlockModDirt apalachiaDirt = null;
    @ObjectHolder("skythern_dirt")
    public static BlockModDirt skythernDirt = null;
    @ObjectHolder("mortum_dirt")
    public static BlockModDirt mortumDirt = null;

    // Grass
    @ObjectHolder("eden_grass")
    public static BlockModGrass edenGrass = null;
    @ObjectHolder("wildwood_grass")
    public static BlockModGrass wildwoodGrass = null;
    @ObjectHolder("apalachia_grass")
    public static BlockModGrass apalachiaGrass = null;
    @ObjectHolder("skythern_grass")
    public static BlockModGrass skythernGrass = null;
    @ObjectHolder("mortum_grass")
    public static BlockModGrass mortumGrass = null;

    // Stone
    @ObjectHolder("twilight_stone")
    public static Block twilightStone = null;

    // Ore
    @ObjectHolder("eden_ore")
    public static Block edenOre = null;
    @ObjectHolder("wildwood_ore")
    public static Block wildwoodOre = null;
    @ObjectHolder("apalachia_ore")
    public static Block apalachiaOre = null;
    @ObjectHolder("skythern_ore")
    public static Block skythernOre = null;
    @ObjectHolder("mortum_ore")
    public static Block mortumOre = null;

    // Sapling
    @ObjectHolder("eden_sapling")
    public static Block edenSapling = null;
    @ObjectHolder("wildwood_sapling")
    public static Block wildwoodSapling = null;
    @ObjectHolder("apalachia_sapling")
    public static Block apalachiaSapling = null;
    @ObjectHolder("skythern_sapling")
    public static Block skythernSapling = null;
    @ObjectHolder("mortum_sapling")
    public static Block mortumSapling = null;

    // Logs
    @ObjectHolder("eden_log")
    public static Block edenLog = null;
    @ObjectHolder("wildwood_log")
    public static Block wildwoodLog = null;
    @ObjectHolder("apalachia_log")
    public static Block apalachiaLog = null;
    @ObjectHolder("skythern_log")
    public static Block skythernLog = null;
    @ObjectHolder("mortum_log")
    public static Block mortumLog = null;

    // Leaves
    @ObjectHolder("eden_leaves")
    public static Block edenLeaves = null;
    @ObjectHolder("wildwood_leaves")
    public static Block wildwoodLeaves = null;
    @ObjectHolder("apalachia_leaves")
    public static Block apalachiaLeaves = null;
    @ObjectHolder("skythern_leaves")
    public static Block skythernLeaves = null;
    @ObjectHolder("mortum_leaves")
    public static Block mortumLeaves = null;

    // Planks
    @ObjectHolder("eden_planks")
    public static Block edenPlanks = null;
    @ObjectHolder("wildwood_planks")
    public static Block wildwoodPlanks = null;
    @ObjectHolder("apalachia_planks")
    public static Block apalachiaPlanks = null;
    @ObjectHolder("skythern_planks")
    public static Block skythernPlanks = null;
    @ObjectHolder("mortum_planks")
    public static Block mortumPlanks = null;

    // Stairs
    @ObjectHolder("eden_stairs")
    public static Block edenStairs = null;
    @ObjectHolder("wildwood_stairs")
    public static Block wildwoodStairs = null;
    @ObjectHolder("apalachia_stairs")
    public static Block apalachiaStairs = null;
    @ObjectHolder("skythern_stairs")
    public static Block skythernStairs = null;
    @ObjectHolder("mortum_stairs")
    public static Block mortumStairs = null;

    // Compressed blocks
    @ObjectHolder("eden_block")
    public static Block edenBlock = null;
    @ObjectHolder("wildwood_block")
    public static Block wildwoodBlock = null;
    @ObjectHolder("apalachia_block")
    public static Block apalachiaBlock = null;
    @ObjectHolder("skythern_block")
    public static Block skythernBlock = null;
    @ObjectHolder("mortum_block")
    public static Block mortumBlock = null;

    // Ground foliage
    @ObjectHolder("sunbloom")
    public static Block sunbloom = null;
    @ObjectHolder("eden_brush")
    public static Block edenBrush = null;
    @ObjectHolder("sun_blossom")
    public static Block sunBlossom = null;
    @ObjectHolder("moonlight_fern")
    public static Block moonlightFern = null;
    @ObjectHolder("moon_bud")
    public static Block moonBud = null;
    @ObjectHolder("wildwood_tallgrass")
    public static Block wildwoodTallgrass = null;
    @ObjectHolder("dusk_flower")
    public static Block duskFlower = null;
    @ObjectHolder("dusk_bloom")
    public static Block duskBloom = null;
    @ObjectHolder("apalachia_tallgrass")
    public static Block apalachiaTallgrass = null;
    @ObjectHolder("skythern_brush")
    public static Block skythernBrush = null;
    @ObjectHolder("dust_lily")
    public static Block dustLily = null;
    @ObjectHolder("dust_brambles")
    public static Block dustBrambles = null;
    @ObjectHolder("demon_brambles")
    public static Block demonBrambles = null;
    @ObjectHolder("eye_plant")
    public static Block eyePlant = null;
    @ObjectHolder("mortum_brush")
    public static Block mortumBrush = null;

    // Crops
    @ObjectHolder("moonbulb_plant")
    public static Block moonbulbPlant = null;
    @ObjectHolder("pink_glowbone_plant")
    public static Block pinkGlowbonePlant = null;
    @ObjectHolder("purple_glowbone_plant")
    public static Block purpleGlowbonePlant = null;
    @ObjectHolder("sky_plant")
    public static Block skyPlant = null;

    // Vine
    @ObjectHolder("wildwood_vine")
    public static Block wildwoodVine = null;

    // Portal
    @ObjectHolder("eden_portal")
    public static BlockModPortal edenPortal = null;
    @ObjectHolder("wildwood_portal")
    public static BlockModPortal wildwoodPortal = null;
    @ObjectHolder("apalachia_portal")
    public static BlockModPortal apalachiaPortal = null;
    @ObjectHolder("skythern_portal")
    public static BlockModPortal skythernPortal = null;
    @ObjectHolder("mortum_portal")
    public static BlockModPortal mortumPortal = null;

    // Other
    @ObjectHolder("blue_fire")
    public static Block blueFire = null;
    @ObjectHolder("eden_torch")
    public static Block edenTorch = null;
    @ObjectHolder("eden_chest")
    public static Block edenChest = null;
    @ObjectHolder("truffle")
    public static Block truffle = null;

    // Arcana

    // Dirt
    @ObjectHolder("arcanite_dirt")
    public static BlockModDirt arcaniteDirt = null;

    // Grass
    @ObjectHolder("arcanite_grass")
    public static BlockModGrass arcaniteGrass = null;

    // Ore
    @ObjectHolder("arcanium_ore")
    public static Block arcaniumOre = null;

    // Structure blocks
    // Normal
    @ObjectHolder("ancient_brick")
    public static Block ancientBrick = null;
    @ObjectHolder("ancient_stone")
    public static Block ancientStone = null;
    @ObjectHolder("ancient_tile")
    public static Block ancientTile = null;
    @ObjectHolder("arcanite_tubes")
    public static Block arcaniteTubes = null;
    @ObjectHolder("arcanium_metal")
    public static Block arcaniumMetal = null;
    @ObjectHolder("arcanium_power")
    public static Block arcaniumPower = null;
    @ObjectHolder("dark_degraded_brick")
    public static Block darkDegradedBrick = null;
    @ObjectHolder("degraded_brick")
    public static Block degradedBrick = null;
    @ObjectHolder("dungeon_lamp")
    public static Block dungeonLamp = null;
    @ObjectHolder("heat_trap")
    public static Block heatTrap = null;
    @ObjectHolder("heat_trap_on")
    public static Block heatTrapOn = null;
    @ObjectHolder("light_degraded_brick")
    public static Block lightDegradedBrick = null;
    @ObjectHolder("soul_sludge")
    public static Block soulSludge = null;
    @ObjectHolder("soul_stone")
    public static Block soulStone = null;

    // Door
    @ObjectHolder("ancient_brick_door")
    public static Block ancientBrickDoor = null;
    @ObjectHolder("degraded_brick_door")
    public static Block degradedBrickDoor = null;
    @ObjectHolder("soul_sludge_door")
    public static Block soulSludgeDoor = null;
    @ObjectHolder("soul_stone_door")
    public static Block soulStoneDoor = null;

    // Spawner
    @ObjectHolder("death_hound_spawner")
    public static Block deathHoundSpawner = null;
    @ObjectHolder("deathcryx_spawner")
    public static Block deathcryxSpawner = null;
    @ObjectHolder("dungeon_prisoner_spawner")
    public static Block dungeonPrisonerSpawner = null;
    @ObjectHolder("living_statue_spawner")
    public static Block livingStatueSpawner = null;
    @ObjectHolder("razorback_spawner")
    public static Block razorbackSpawner = null;
    @ObjectHolder("roamer_spawner")
    public static Block roamerSpawner = null;

    // Utility
    @ObjectHolder("arcanium_extractor")
    public static Block arcaniumExtractor = null;

    // Boss altars
    @ObjectHolder("dramix_altar")
    public static Block dramixAltar = null;
    @ObjectHolder("parasecta_altar")
    public static Block parasectaAltar = null;

    // Stained glass
    @ObjectHolder("stained_glass")
    public static Block stainedGlass = null;
    @ObjectHolder("stained_glass2")
    public static Block stainedGlass2 = null;
    @ObjectHolder("stained_glass3")
    public static Block stainedGlass3 = null;
    @ObjectHolder("stained_glass4")
    public static Block stainedGlass4 = null;
    @ObjectHolder("stained_glass5")
    public static Block stainedGlass5 = null;
    @ObjectHolder("stained_glass6")
    public static Block stainedGlass6 = null;
    @ObjectHolder("stained_glass7")
    public static Block stainedGlass7 = null;
    @ObjectHolder("stained_glass8")
    public static Block stainedGlass8 = null;

    // Portal blocks
    @ObjectHolder("arcana_portal")
    public static Block arcanaPortal = null;
    @ObjectHolder("arcana_portal_frame")
    public static Block arcanaPortalFrame = null;
    @ObjectHolder("arcana_hard_portal_frame")
    public static Block arcanaHardPortalFrame = null;

    // Eucalyptus
    @ObjectHolder("eucalyptus_log")
    public static Block eucalyptusLog = null;
    @ObjectHolder("eucalyptus_planks")
    public static Block eucalyptusPlanks = null;

    // Crops
    @ObjectHolder("aquamarine_plant")
    public static Block aquamarinePlant = null;
    @ObjectHolder("eucalyptus_plant")
    public static Block eucalyptusPlant = null;
    @ObjectHolder("firestock_plant")
    public static Block firestockPlant = null;
    @ObjectHolder("hitchak_plant")
    public static Block hitchakPlant = null;
    @ObjectHolder("lamona_plant")
    public static Block lamonaPlant = null;
    @ObjectHolder("marsine_plant")
    public static Block marsinePlant = null;
    @ObjectHolder("pinfly_plant")
    public static Block pinflyPlant = null;
    @ObjectHolder("veilo_plant")
    public static Block veiloPlant = null;

    // Furnace
    @ObjectHolder("greenlight_furnace")
    public static Block greenlightFurnace = null;
    @ObjectHolder("greenlight_furnace_on")
    public static Block greenlightFurnaceOn = null;
    @ObjectHolder("oceanfire_furnace")
    public static Block oceanfireFurnace = null;
    @ObjectHolder("oceanfire_furnace_on")
    public static Block oceanfireFurnaceOn = null;
    @ObjectHolder("molten_furnace")
    public static Block moltenFurnace = null;
    @ObjectHolder("molten_furnace_on")
    public static Block moltenFurnaceOn = null;
    @ObjectHolder("whitefire_furnace")
    public static Block whitefireFurnace = null;
    @ObjectHolder("whitefire_furnace_on")
    public static Block whitefireFurnaceOn = null;
    @ObjectHolder("moonlight_furnace")
    public static Block moonlightFurnace = null;
    @ObjectHolder("moonlight_furnace_on")
    public static Block moonlightFurnaceOn = null;
    @ObjectHolder("demon_furnace")
    public static Block demonFurnace = null;
    @ObjectHolder("demon_furnace_on")
    public static Block demonFurnaceOn = null;

    // Miscellaneous utility
    @ObjectHolder("acceleron")
    public static Block acceleron = null;
    @ObjectHolder("arcanium_torch")
    public static Block arcaniumTorch = null;
    @ObjectHolder("elevantium")
    public static Block elevantium = null;
    @ObjectHolder("star_bridge")
    public static Block starBridge = null;

    //We are avoiding rails for now
    //public static Block arcaniteRails = new BlockRedstonelessRails("arcanite_rails");

    // Vethea
    // Terrain
    @ObjectHolder("dream_dirt")
    public static BlockModDirt dreamDirt = null;
    @ObjectHolder("dream_grass")
    public static BlockModGrass dreamGrass = null;
    @ObjectHolder("dream_stone")
    public static Block dreamStone = null;

    // Logs
    @ObjectHolder("dreamwood_log")
    public static Block dreamwoodLog = null;
    @ObjectHolder("firewood_log")
    public static Block firewoodLog = null;
    @ObjectHolder("hyrewood_log")
    public static Block hyrewoodLog = null;
    @ObjectHolder("mintwood_log")
    public static Block mintwoodLog = null;

    // Leaves
    @ObjectHolder("dreamwood_leaves")
    public static Block dreamwoodLeaves = null;
    @ObjectHolder("firewood_leaves")
    public static Block firewoodLeaves = null;
    @ObjectHolder("hyrewood_leaves")
    public static Block hyrewoodLeaves = null;
    @ObjectHolder("mintwood_leaves")
    public static Block mintwoodLeaves = null;

    // Ground foliage
    @ObjectHolder("bulbatobe")
    public static Block bulbatobe = null;
    @ObjectHolder("cracklespike")
    public static Block cracklespike = null;
    @ObjectHolder("dreamglow")
    public static Block dreamglow = null;
    @ObjectHolder("fernite")
    public static Block fernite = null;
    @ObjectHolder("green_dulah")
    public static Block greenDulah = null;
    @ObjectHolder("green_gemtop")
    public static Block greenGemtop = null;
    @ObjectHolder("purple_gemtop")
    public static Block purpleGemtop = null;
    @ObjectHolder("shimmer")
    public static Block shimmer = null;
    @ObjectHolder("shine_grass")
    public static Block shineGrass = null;
    @ObjectHolder("yellow_dulah")
    public static Block yellowDulah = null;

    // Vines
    @ObjectHolder("weedwood_vine")
    public static Block weedwoodVine = null;
    @ObjectHolder("blossomed_weedwood_vine")
    public static Block blossomedWeedwoodVine = null;

    // Building blocks
    @ObjectHolder("dark_dream_bricks")
    public static Block darkDreamBricks = null;
    @ObjectHolder("light_dream_bricks")
    public static Block lightDreamBricks = null;
    @ObjectHolder("red_dream_bricks")
    public static Block redDreamBricks = null;
    @ObjectHolder("smooth_glass")
    public static Block smoothGlass = null;

    // Lighting
    @ObjectHolder("fire_crystal")
    public static Block fireCrystal = null;
    @ObjectHolder("firelight")
    public static Block firelight = null;

    // Structure
    // General
    @ObjectHolder("dream_lamp")
    public static Block dreamLamp = null;
    @ObjectHolder("everstone")
    public static Block everstone = null;
    @ObjectHolder("dark_everstone")
    public static Block darkEverstone = null;
    @ObjectHolder("white_everstone")
    public static Block whiteEverstone = null;

    // Crypt
    @ObjectHolder("black_hungerstone")
    public static Block blackHungerstone = null;
    @ObjectHolder("green_hungerstone")
    public static Block greenHungerstone = null;
    @ObjectHolder("crypt_floor")
    public static Block cryptFloor = null;
    @ObjectHolder("crypt_wall")
    public static Block cryptWall = null;
    @ObjectHolder("metal_caging")
    public static Block metalCaging = null;

    // Village
    @ObjectHolder("village_lamp")
    public static Block villageLamp = null;

    // Hive
    @ObjectHolder("cell_lamp")
    public static Block cellLamp = null;
    @ObjectHolder("hive_wall")
    public static Block hiveWall = null;

    // Karos Madhouse
    @ObjectHolder("black_karos_bricks")
    public static Block blackKarosBricks = null;
    @ObjectHolder("blue_karos_bricks")
    public static Block blueKarosBricks = null;
    @ObjectHolder("heliotic_beam")
    public static Block helioticBeam = null;
    @ObjectHolder("karos_cannon")
    public static Block karosCannon = null;
    @ObjectHolder("karos_heat_tile_green")
    public static Block karosHeatTileGreen = null;
    @ObjectHolder("karos_heat_tile_red")
    public static Block karosHeatTileRed = null;

    // Lunic Garden
    @ObjectHolder("luna_bricks")
    public static Block lunaBricks = null;
    @ObjectHolder("luna_stone")
    public static Block lunaStone = null;

    // Raglok Chamber
    @ObjectHolder("chamber_wall")
    public static Block chamberWall = null;
    @ObjectHolder("shifted_chamber_wall")
    public static Block shiftedChamberWall = null;
    @ObjectHolder("stacked_chamber_wall")
    public static Block stackedChamberWall = null;

    // Wreck Hall
    @ObjectHolder("hall_wall")
    public static Block hallWall = null;

    // Utility
    @ObjectHolder("infusion_table")
    public static Block infusionTable = null;

    // Boss altars
    @ObjectHolder("karos_altar")
    public static Block karosAltar = null;
    @ObjectHolder("lunic_altar")
    public static Block lunicAltar = null;
    @ObjectHolder("quadrotic_altar")
    public static Block quadroticAltar = null;
    @ObjectHolder("raglok_altar")
    public static Block raglokAltar = null;
    @ObjectHolder("wreck_altar")
    public static Block wreckAltar = null;

    // Mob spawners
    @ObjectHolder("biphron_spawner")
    public static Block biphronSpawner = null;
    @ObjectHolder("dreamwrecker_spawner")
    public static Block dreamwreckerSpawner = null;
    @ObjectHolder("gorgosion_spawner")
    public static Block gorgosionSpawner = null;
    @ObjectHolder("twins_spawner")
    public static Block twinsSpawner = null;
    @ObjectHolder("vermenous_spawner")
    public static Block vermenousSpawner = null;

    // Acid
    @ObjectHolder("acid_block")
    public static Block acidBlock = null;
    @ObjectHolder("bacterial_acid")
    public static Block bacterialAcid = null;
    @ObjectHolder("lunic_acid")
    public static Block lunicAcid = null;

    // Portal blocks
    @ObjectHolder("nightmare_bed_block")
    public static Block nightmareBed = null;
    @ObjectHolder("vethea_portal")
    public static BlockModPortal vetheaPortal = null;

    public static void AddWoodVariants() {
        for (WoodType woodType : WoodType.values()) {
            String woodName = woodType.getName();

            // Make special property key that allows ONLY one value because slabs are special level of stupid
            final PropertyEnum<WoodType> restrictedKey = PropertyEnum.create("variant", WoodType.class,
                    input -> input == woodType);

            BlockModPlank planks = new BlockModPlank(woodType);
            //Block stairs = new BlockModStairs(planks, woodName + "_stairs");
            Block singleSlab = new BlockModSlab(planks, null, woodType) {
                @Override
                public boolean isDouble() {
                    return false;
                }

                protected Block getSingle() {
                    return this;
                }

                @Override
                public IProperty<WoodType> getVariantProperty() {
                    return restrictedKey;
                }
            };

            Block doubleSlab = new BlockModSlab(planks, singleSlab, woodType) {
                @Override
                public boolean isDouble() {
                    return true;
                }

                protected Block getSingle() {
                    return singleSlab;
                }

                @Override
                public IProperty<WoodType> getVariantProperty() {
                    return restrictedKey;
                }
            };

            woodType.setPlank(planks);
            //woodType.setStair(stairs);
            woodType.setSingleSlab(singleSlab);
            woodType.setDoubleSlab(doubleSlab);

            //ModItems.ITEMS.add(new ItemSlab(singleSlab, (BlockSlab) singleSlab, (BlockSlab) doubleSlab)
                    //.setRegistryName(singleSlab.getRegistryName()));
            //ModItems.ITEMS.add(new ItemSlab(doubleSlab, (BlockSlab) singleSlab, (BlockSlab) doubleSlab)
                    //.setRegistryName(doubleSlab.getRegistryName()));
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        DivineRPG.logger.info("Registering DivineRPG blocks");

        ModBlocks.AddWoodVariants();
        IForgeRegistry<Block> registry = event.getRegistry();

        // Vanilla dimensions

        // Ores
        register(registry, new BlockModOre("arlemite_ore", 3.0F, 2000F, DIAMOND, null));
        register(registry, new BlockModOre("realmite_ore", 3.0F, 2000F, IRON, null));
        register(registry, new BlockModOre("rupee_ore", 3.0F, 2000F, DIAMOND, null));
        register(registry, new BlockModOre("bloodgem_ore", 3.0F, 2000F, DIAMOND, ModItems.bloodgem));
        register(registry, new BlockNetheriteOre("netherite_ore", 3.0F, 2000F, DIAMOND, null));

        // Compressed ore blocks
        register(registry, new BlockBeaconBase(EnumBlockType.ROCK, "arlemite_block", 5.0F, DIAMOND));
        register(registry, new BlockBeaconBase(EnumBlockType.ROCK, "realmite_block", 5.0F, IRON));
        register(registry, new BlockBeaconBase(EnumBlockType.ROCK, "rupee_block", 5.0F, DIAMOND));
        register(registry, new BlockBeaconBase(EnumBlockType.ROCK, "bloodgem_block", 5.0F, DIAMOND));
        register(registry, new BlockBeaconBase(EnumBlockType.ROCK, "netherite_block", 5.0F, DIAMOND));

        // Mob pumpkins
        register(registry, new BlockMobPumpkin("blaze_pumpkin", SoundEvents.ENTITY_BLAZE_AMBIENT));
        register(registry, new BlockMobPumpkin("creeper_pumpkin", SoundEvents.ENTITY_CREEPER_PRIMED));
        register(registry, new BlockMobPumpkin("cyclops_pumpkin", ModSounds.CYCLOPS));
        register(registry, new BlockMobPumpkin("ender_pumpkin", SoundEvents.ENTITY_ENDERMEN_SCREAM));
        register(registry, new BlockMobPumpkin("ender_watcher_pumpkin", SoundEvents.ENTITY_ENDERMEN_AMBIENT));
        register(registry, new BlockMobPumpkin("frost_pumpkin", ModSounds.FROST));
        register(registry, new BlockMobPumpkin("ghast_pumpkin", SoundEvents.ENTITY_GHAST_SCREAM));
        register(registry, new BlockMobPumpkin("glacon_pumpkin", ModSounds.GLACIDE));
        register(registry, new BlockMobPumpkin("hellspider_pumpkin", ModSounds.HELL_SPIDER));
        register(registry, new BlockMobPumpkin("jungle_spider_pumpkin", ModSounds.HELL_SPIDER));
        register(registry, new BlockMobPumpkin("skeleton_pumpkin", SoundEvents.ENTITY_SKELETON_AMBIENT));
        register(registry, new BlockMobPumpkin("spider_pumpkin", SoundEvents.ENTITY_SPIDER_AMBIENT));
        register(registry, new BlockMobPumpkin("zombie_pumpkin", SoundEvents.ENTITY_ZOMBIE_AMBIENT));

        // Torches
        register(registry, new BlockModTorch("aqua_torch", ParticleType.BLUE_FLAME));
        register(registry, new BlockModTorch("skeleton_torch", ParticleType.BLACK_FLAME));

        // Decorative blocks

        // Steel
        register(registry, new BlockMod(EnumBlockType.ROCK, "black_steel", 10.0F, DIAMOND).setResistance(60.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "blue_steel", 10.0F, DIAMOND).setResistance(60.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "bright_red_steel", 10.0F, DIAMOND).setResistance(60.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "green_steel", 10.0F, DIAMOND).setResistance(60.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "orange_steel", 10.0F, DIAMOND).setResistance(60.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "purple_steel", 10.0F, DIAMOND).setResistance(60.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "red_steel", 10.0F, DIAMOND).setResistance(60.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "white_steel", 10.0F, DIAMOND).setResistance(60.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "yellow_steel", 10.0F, DIAMOND).setResistance(60.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "teal_steel", 10.0F, DIAMOND).setResistance(60.0F));

        // Vanes
        register(registry, new BlockMod(EnumBlockType.ROCK, "blue_vane", 2.0F, IRON).setResistance(10F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "cyan_vane", 2.0F, IRON).setResistance(10F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "purple_vane", 2.0F, IRON).setResistance(10F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "red_vane", 2.0F, IRON).setResistance(10F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "yellow_vane", 2.0F, IRON).setResistance(10F));

        // Bricks
        register(registry, new BlockMod(EnumBlockType.ROCK, "aquatonic_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "lava_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "arlemite_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "darkstone_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "diamond_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "gold_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "green_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "iron_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "lapis_lazuli_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "milk_stone_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "netherite_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "pink_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "purple_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "realmite_bricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "redstone_bricks", 3.0F, IRON).setResistance(30.0F));

        // Minibricks
        register(registry, new BlockMod(EnumBlockType.ROCK, "minibricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "arlemite_minibricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "bedrock_minibricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "netherite_minibricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "realmite_minibricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "bloodgem_minibricks", 3.0F, IRON).setResistance(30.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "rupee_minibricks", 3.0F, IRON).setResistance(30.0F));

        // Lamps
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "aqua_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "arlemite_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "blaze_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "bluefire_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "diamond_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "divine_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "draken_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "eden_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "ender_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "ender_stone_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "gold_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "ice_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "jungle_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "kraken_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "lapis_lazuli_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "lava_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "milky_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "molten_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "netherite_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "realmite_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "redstone_ore_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "rupee_lamp", 3.0F).setResistance(30.0F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "terran_lamp", 3.0F).setResistance(30.0F));

        // Powered fences
        register(registry, new BlockLightFence(MapColor.BLUE, "blue_fence", false, 0.5F));
        register(registry, new BlockLightFence(MapColor.BLUE, "blue_fence_on", true, 0.5F));
        register(registry, new BlockLightFence(MapColor.GREEN, "green_fence", false, 0.5F));
        register(registry, new BlockLightFence(MapColor.GREEN, "green_fence_on", true, 0.5F));
        register(registry, new BlockLightFence(MapColor.RED, "red_fence", false, 0.5F));
        register(registry, new BlockLightFence(MapColor.RED, "red_fence_on", true, 0.5F));

        // Miscellaneous decorative blocks
        register(registry, new BlockMod("asphalt", 2.0F));
        register(registry, new BlockMod(EnumBlockType.ROCK, "blue_stone", 1.5F, WOOD_GOLD).setResistance(10F).setLightLevel(1));
        register(registry, new BlockMod(EnumBlockType.WOOL, "checker", 0.8F, WOOD_GOLD));
        register(registry, new BlockMod(EnumBlockType.WOOD, "crate", 2.5F, WOOD_GOLD));
        register(registry, new BlockMod(EnumBlockType.ROCK, "darkstone", 50f, DIAMOND).setResistance(2000.0F).setLightLevel(1));
        register(registry, new BlockMod(EnumBlockType.WOOL, "fancy_wool", 0.8F, WOOD_GOLD));
        register(registry, new BlockMod(EnumBlockType.ROCK, "milk_stone", 1.5F, WOOD_GOLD).setResistance(10F));
        register(registry, new BlockMod(EnumBlockType.WOOD, "plank_design", 2.5F, WOOD_GOLD));
        register(registry, new BlockMod(EnumBlockType.WOOL, "rainbow_wool", 0.8F, WOOD_GOLD));

        // Spike blocks
        register(registry, new BlockSpike("spike_block"));
        register(registry, new BlockHotSpike("hot_spike_block"));

        // Utility blocks
        register(registry, new BlockAltarOfCorruption("altar_of_corruption"));
        register(registry, new BlockBoneChest("bone_chest"));

        // Divine blocks
        register(registry, new BlockModSapling("divine_sapling", Blocks.GRASS, Blocks.DIRT, new DivineTree(true)));
        register(registry, new BlockModLog("divine_log", MapColor.YELLOW));
        register(registry, new BlockModLeaves("divine_leaves", 0.3F, divineSapling, MapColor.YELLOW));
        register(registry, new BlockMod(EnumBlockType.WOOD, "divine_planks", 2.0F));
        register(registry, new BlockMod("divine_moss_stone", 2.0F).setResistance(10));
        register(registry, new BlockMod(EnumBlockType.ROCK, "divine_rock", 1.5F, STONE).setResistance(10F));

        // Miscellaneous utility
        register(registry, new BlockModLight("slime_light", 1.5F));
        register(registry, new BlockModBridge("dark_bridge", 1.5F));

        // Crops
        register(registry, new BlockTomatoPlant());
        register(registry, new BlockWhiteMushroomPlant());

        // Boss statues
        register(registry, new BlockStatue("ancient_entity_statue", StatueType.ANCIENT_ENTITY_STATUE));
        register(registry, new BlockStatue("ayeraco_statue", StatueType.AYERACO_STATUE));
        register(registry, new BlockStatue("densos_statue", StatueType.DENSOS_STATUE));
        register(registry, new BlockStatue("dramix_statue", StatueType.DRAMIX_STATUE));
        register(registry, new BlockStatue("eternal_archer_statue", StatueType.ETERNAL_ARCHER_STATUE));
        register(registry, new BlockStatue("karot_statue", StatueType.KAROT_STATUE));
        register(registry, new BlockStatue("king_of_scorchers_statue", StatueType.KING_OF_SCORCHERS_STATUE));
        register(registry, new BlockStatue("parasecta_statue", StatueType.PARASECTA_STATUE));
        register(registry, new BlockStatue("reyvor_statue", StatueType.REYVOR_STATUE));
        register(registry, new BlockStatue("soul_fiend_statue", StatueType.SOUL_FIEND_STATUE));
        register(registry, new BlockStatue("the_watcher_statue", StatueType.THE_WATCHER_STATUE));
        register(registry, new BlockStatue("twilight_demon_statue", StatueType.TWILIGHT_DEMON_STATUE));
        register(registry, new BlockStatue("vamacheron_statue", StatueType.VAMACHERON_STATUE));

        // Ayeraco technical blocks
        register(registry, new BlockAyeracoBeam("ayeraco_beam_blue", "blue"));
        register(registry, new BlockAyeracoBeam("ayeraco_beam_green", "green"));
        register(registry, new BlockAyeracoBeam("ayeraco_beam_purple", "purple"));
        register(registry, new BlockAyeracoBeam("ayeraco_beam_red", "red"));
        register(registry, new BlockAyeracoBeam("ayeraco_beam_yellow", "yellow"));
        register(registry, new BlockAyeracoSpawn());

        // Liquid
        register(registry, new BlockTar("tar", ModLiquids.tar));

        // Iceika

        // Terrain
        register(registry, new BlockModDirt("frozen_dirt", 2.5F, MapColor.WHITE_STAINED_HARDENED_CLAY));
        register(registry, new BlockModGrass("frozen_grass", 2.5F, MapColor.LIGHT_BLUE));
        register(registry, new BlockMod("frozen_stone", 6.0F));
        register(registry, new BlockModLog("frozen_log", MapColor.WHITE_STAINED_HARDENED_CLAY).setHardness(5.0F));
        register(registry, new BlockModLeaves("brittle_leaves", 0.1F, MapColor.WHITE_STAINED_HARDENED_CLAY));
        register(registry, new BlockMod(EnumBlockType.WOOD, "frozen_planks", 2.0F));

        // Structure blocks
        register(registry, new BlockMod("coalstone", 3.0F));
        register(registry, new BlockCoalstoneFurnace("coalstone_furnace", false));
        register(registry, new BlockCoalstoneFurnace("coalstone_furnace_on", true));
        register(registry, new BlockModStairs("coalstone_stairs", getBlockFromList("coalstone")));
        register(registry, new BlockModSpawner("frost_archer_spawner", "frost_archer"));
        register(registry, new BlockFrostedChest("frosted_chest").setHardness(2.5F));
        register(registry, new BlockModGlass("frosted_glass", 1.0F));
        register(registry, new BlockModUnbreakable("icy_bricks"));
        register(registry, new BlockModUnbreakable("icy_stone"));
        register(registry, new BlockModSpawner("rollum_spawner", "rollum"));
        register(registry, new BlockMod("snow_bricks", 6.0F));
        register(registry, new BlockModDoor("steel_door", Material.IRON, 7.0f));
        register(registry, new BlockMod(EnumBlockType.ROCK, "workshop_bookcase", 1.5F));
        register(registry, new BlockMod(EnumBlockType.WOOL, "workshop_carpet", 0.1F));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "workshop_lamp", 0.3F));

        // Candy canes
        register(registry, new BlockCandyCane("blue_candy_cane"));
        register(registry, new BlockCandyCane("green_candy_cane"));
        register(registry, new BlockCandyCane("pink_candy_cane"));
        register(registry, new BlockCandyCane("red_candy_cane"));
        register(registry, new BlockCandyCane("yellow_candy_cane"));

        // Christmas lights
        register(registry, new BlockChristmasLights("blue_christmas_lights"));
        register(registry, new BlockChristmasLights("green_christmas_lights"));
        register(registry, new BlockChristmasLights("purple_christmas_lights"));
        register(registry, new BlockChristmasLights("red_christmas_lights"));
        register(registry, new BlockChristmasLights("yellow_christmas_lights"));

        // Chest
        register(registry, new BlockPresentBox("present_box"));

        // Crops
        register(registry, new BlockWinterberryBush(false, "winterberry_bush"));
        register(registry, new BlockWinterberryBush(true, "ripe_winterberry_bush"));

        // Other
        register(registry, new BlockModFire("iceika_fire"));
        register(registry, new BlockModPortal("iceika_portal", ModDimensions.iceikaDimension.getId(), iceikaFire, Blocks.SNOW, ParticleType.FROST));

        // Twilight dimensions

        // Dirt
        register(registry, new BlockModDirt("eden_dirt", 5.0F, MapColor.YELLOW));
        register(registry, new BlockModDirt("wildwood_dirt", 5.0F, MapColor.BLUE));
        register(registry, new BlockModDirt("apalachia_dirt", 5.0F, MapColor.PURPLE));
        register(registry, new BlockModDirt("skythern_dirt", 5.0F, MapColor.GRAY));
        register(registry, new BlockModDirt("mortum_dirt", 5.0F, MapColor.BLACK));

        // Grass
        register(registry, new BlockModGrass("eden_grass", 5.0F, MapColor.YELLOW));
        register(registry, new BlockModGrass("wildwood_grass", 5.0F, MapColor.BLUE));
        register(registry, new BlockModGrass("apalachia_grass", 5.0F, MapColor.PURPLE));
        register(registry, new BlockModGrass("skythern_grass", 5.0F, MapColor.CLOTH));
        register(registry, new BlockModGrass("mortum_grass", 5.0F, MapColor.BLACK));

        // Stone
        register(registry, new BlockMod("twilight_stone", 6.0F));

        // Ore
        register(registry, new BlockTwilightOre("eden_ore", 9, 2000F, DIAMOND, ModItems.edenFragments));
        register(registry, new BlockTwilightOre("wildwood_ore", 9, 2000F, DIAMOND, ModItems.wildwoodFragments));
        register(registry, new BlockTwilightOre("apalachia_ore", 9, 2000F, DIAMOND, ModItems.apalachiaFragments));
        register(registry, new BlockTwilightOre("skythern_ore", 9, 2000F, DIAMOND, ModItems.skythernFragments));
        register(registry, new BlockTwilightOre("mortum_ore", 9, 2000F, DIAMOND, ModItems.mortumFragments));

        // Sapling
        register(registry, new BlockModSapling("eden_sapling", edenGrass, edenDirt, new EdenTree(true)));
        register(registry, new BlockModSapling("wildwood_sapling", wildwoodGrass, wildwoodDirt, new WildWoodTree(true)));
        register(registry, new BlockModSapling("apalachia_sapling", apalachiaGrass, apalachiaDirt, new ApalachiaTree(true)));
        register(registry, new BlockModSapling("skythern_sapling", skythernGrass, skythernDirt, new SkythernTree(true)));
        register(registry, new BlockModSapling("mortum_sapling", mortumGrass, mortumDirt, new MortumTree(true)));

        // Logs
        register(registry, new BlockModLog("eden_log", MapColor.YELLOW));
        register(registry, new BlockModLog("wildwood_log", MapColor.BLUE));
        register(registry, new BlockModLog("apalachia_log", MapColor.PURPLE));
        register(registry, new BlockModLog("skythern_log", MapColor.GRAY));
        register(registry, new BlockModLog("mortum_log", MapColor.RED));

        // Leaves
        register(registry, new BlockModLeaves("eden_leaves", 0.5F, edenSapling, MapColor.YELLOW));
        register(registry, new BlockModLeaves("wildwood_leaves", 0.5F, wildwoodSapling, MapColor.LIGHT_BLUE));
        register(registry, new BlockModLeaves("apalachia_leaves", 0.5F, apalachiaSapling, MapColor.PINK).setLightLevel(0.5F));
        register(registry, new BlockModLeaves("skythern_leaves", 0.5F, skythernSapling, MapColor.CLOTH));
        register(registry, new BlockModLeaves("mortum_leaves", 0.5F, mortumSapling, MapColor.RED));

        // Planks
        register(registry, new BlockMod(EnumBlockType.WOOD, "eden_planks", 2.0F));
        register(registry, new BlockMod(EnumBlockType.WOOD, "wildwood_planks", 2.0F));
        register(registry, new BlockMod(EnumBlockType.WOOD, "apalachia_planks", 2.0F));
        register(registry, new BlockMod(EnumBlockType.WOOD, "skythern_planks", 2.0F));
        register(registry, new BlockMod(EnumBlockType.WOOD, "mortum_planks", 2.0F));

        // Stairs
        register(registry, new BlockModStairs("eden_stairs", getBlockFromList("eden_planks")));
        register(registry, new BlockModStairs("wildwood_stairs", getBlockFromList("wildwood_planks")));
        register(registry, new BlockModStairs("apalachia_stairs", getBlockFromList("apalachia_planks")));
        register(registry, new BlockModStairs("skythern_stairs", getBlockFromList("skythern_planks")));
        register(registry, new BlockModStairs("mortum_stairs", getBlockFromList("mortum_planks")));

        // Compressed blocks
        register(registry, new BlockBeaconBase("eden_block", 9.0F));
        register(registry, new BlockBeaconBase("wildwood_block", 9.0F));
        register(registry, new BlockBeaconBase("apalachia_block", 9.0F));
        register(registry, new BlockBeaconBase("skythern_block", 9.0F));
        register(registry, new BlockBeaconBase("mortum_block", 9.0F));

        // Ground foliage
        register(registry, new BlockTwilightFlower("sunbloom", edenGrass, MapColor.YELLOW));
        register(registry, new BlockTwilightGrass("eden_brush", edenGrass, MapColor.YELLOW));
        register(registry, new BlockTwilightFlower("sun_blossom", edenGrass, 0.9, 0.6, MapColor.YELLOW));
        register(registry, new BlockTwilightFlower("moonlight_fern", wildwoodGrass, 0.8, 0.8, MapColor.BLUE));
        register(registry, new BlockTwilightFlower("moon_bud", wildwoodGrass, 0.8, 0.7, MapColor.BLUE));
        register(registry, new BlockModDoublePlant("wildwood_tallgrass", wildwoodGrass, MapColor.BLUE));
        register(registry, new BlockModDoublePlant("dusk_flower", apalachiaGrass, MapColor.PURPLE));
        register(registry, new BlockTwilightFlower("dusk_bloom", apalachiaGrass, 0.5, 0.5, MapColor.PURPLE));
        register(registry, new BlockTwilightGrass("apalachia_tallgrass", apalachiaGrass, MapColor.PURPLE));
        register(registry, new BlockTwilightGrass("skythern_brush", skythernGrass, MapColor.GRAY));
        register(registry, new BlockTwilightFlower("dust_lily", skythernGrass, MapColor.GRAY));
        register(registry, new BlockBrambles("dust_brambles", skythernGrass, MapColor.GRAY));
        register(registry, new BlockBrambles("demon_brambles", mortumGrass, MapColor.BLACK));
        register(registry, new BlockTwilightFlower("eye_plant", mortumGrass, 0.5, 0.5, MapColor.BLACK));
        register(registry, new BlockTwilightGrass("mortum_brush", mortumGrass, MapColor.BLACK));

        // Crops
        register(registry, new BlockMoonbulb().setLightLevel(0.6f));
        register(registry, new BlockPinkGlowbone().setLightLevel(0.6f));
        register(registry, new BlockPurpleGlowbone().setLightLevel(0.6f));
        register(registry, new BlockSkyPlant());

        // Vine
        register(registry, new BlockModVine("wildwood_vine"));

        // Portal
        register(registry, new BlockModPortal("eden_portal", ModDimensions.edenDimension.getId(), blueFire, divineRock, ParticleType.EDEN_PORTAL));
        register(registry, new BlockModPortal("wildwood_portal", ModDimensions.wildWoodDimension.getId(), blueFire, edenBlock, ParticleType.WILDWOOD_PORTAL));
        register(registry, new BlockModPortal("apalachia_portal", ModDimensions.apalachiaDimension.getId(), blueFire, wildwoodBlock, ParticleType.APALACHIA_PORTAL));
        register(registry, new BlockModPortal("skythern_portal", ModDimensions.skythernDimension.getId(), blueFire, apalachiaBlock, ParticleType.SKYTHERN_PORTAL));
        register(registry, new BlockModPortal("mortum_portal", ModDimensions.mortumDimension.getId(), blueFire, skythernBlock, ParticleType.MORTUM_PORTAL));

        // Other
        register(registry, new BlockModFire("blue_fire"));
        register(registry, new BlockModTorch("eden_torch", ParticleType.GREEN_FLAME));
        register(registry, new BlockEdenChest("eden_chest"));
        register(registry, new BlockMod(EnumBlockType.PLANT, "truffle", 1.0F));

        // Arcana

        // Dirt
        register(registry, new BlockModDirt("arcanite_dirt", 0.5F, MapColor.BLUE));

        // Grass
        register(registry, new BlockModGrass("arcanite_grass", 0.5F, MapColor.BLUE));

        // Ore
        register(registry, new BlockMod("arcanium_ore", 3.0F));

        // Structure blocks
        // Normal
        register(registry, new BlockModUnbreakable("ancient_brick"));
        register(registry, new BlockModUnbreakable("ancient_stone"));
        register(registry, new BlockModUnbreakable("ancient_tile"));
        register(registry, new BlockModLadder("arcanite_tubes"));
        register(registry, new BlockModUnbreakable("arcanium_metal"));
        register(registry, new BlockModUnbreakable("arcanium_power"));
        register(registry, new BlockModUnbreakable("dark_degraded_brick"));
        register(registry, new BlockModUnbreakable("degraded_brick"));
        register(registry, new BlockModUnbreakable("dungeon_lamp").setLightLevel(1.0F));
        register(registry, new BlockHeatTrap("heat_trap"));
        register(registry, new BlockHeatTrap("heat_trap_on"));
        register(registry, new BlockModUnbreakable("light_degraded_brick"));
        register(registry, new BlockModUnbreakable("soul_sludge"));
        register(registry, new BlockModUnbreakable("soul_stone"));

        // Door
        register(registry, new BlockArcanaDoor("ancient_brick_door", ModItems.ancientKey));
        register(registry, new BlockArcanaDoor("degraded_brick_door", ModItems.degradedKey));
        register(registry, new BlockArcanaDoor("soul_sludge_door", ModItems.sludgeKey));
        register(registry, new BlockArcanaDoor("soul_stone_door", ModItems.soulKey));

        // Spawner
        register(registry, new BlockArcanaSpawner("death_hound_spawner", "death_hound"));
        register(registry, new BlockArcanaSpawner("deathcryx_spawner", "deathcryx"));
        register(registry, new BlockArcanaSpawner("dungeon_prisoner_spawner", "dungeon_prisoner"));
        register(registry, new BlockArcanaSpawner("living_statue_spawner", "living_statue"));
        register(registry, new BlockArcanaSpawner("razorback_spawner", "razorback"));
        register(registry, new BlockArcanaSpawner("roamer_spawner", "roamer"));

        // Utility
        register(registry, new BlockArcaniumExtractor("arcanium_extractor"));

        // Boss altars
        register(registry, new BlockDramixAltar("dramix_altar"));
        register(registry, new BlockParasectaAltar("parasecta_altar"));

        // Stained glass
        register(registry, new BlockModGlass("stained_glass", 0.3F).setUnlocalizedName("stained_glass"));
        register(registry, new BlockModGlass("stained_glass2", 0.3F).setUnlocalizedName("stained_glass"));
        register(registry, new BlockModGlass("stained_glass3", 0.3F).setUnlocalizedName("stained_glass"));
        register(registry, new BlockModGlass("stained_glass4", 0.3F).setUnlocalizedName("stained_glass"));
        register(registry, new BlockModGlass("stained_glass5", 0.3F).setUnlocalizedName("stained_glass"));
        register(registry, new BlockModGlass("stained_glass6", 0.3F).setUnlocalizedName("stained_glass"));
        register(registry, new BlockModGlass("stained_glass7", 0.3F).setUnlocalizedName("stained_glass"));
        register(registry, new BlockModGlass("stained_glass8", 0.3F).setUnlocalizedName("stained_glass"));

        // Portal blocks
        register(registry, new BlockArcanaPortal("arcana_portal", ModDimensions.arcanaDimension.getId()));
        register(registry, new BlockArcanaPortalFrame("arcana_portal_frame", arcanaPortal));
        register(registry, new BlockArcanaPortalFrame("arcana_hard_portal_frame", arcanaPortal).setBlockUnbreakable().setResistance(6000000F).setCreativeTab(null));

        // Eucalyptus
        register(registry, new BlockModLog("eucalyptus_log", MapColor.CLOTH));
        register(registry, new BlockMod(EnumBlockType.WOOD, "eucalyptus_planks", 2.0F));

        // Crops
        register(registry, new BlockAquaMarine("aquamarine_plant"));
        register(registry, new BlockEucalyptusRoot("eucalyptus_plant"));
        register(registry, new BlockFirestock());
        register(registry, new BlockHitchak("hitchak_plant"));
        register(registry, new BlockLamona("lamona_plant"));
        register(registry, new BlockMarsine("marsine_plant"));
        register(registry, new BlockPinfly());
        register(registry, new BlockVeilo("veilo_plant"));

        // Furnace
        register(registry, new BlockGreenlightFurnace("greenlight_furnace", false));
        register(registry, new BlockGreenlightFurnace("greenlight_furnace_on", true));
        register(registry, new BlockOceanfireFurnace("oceanfire_furnace", false));
        register(registry, new BlockOceanfireFurnace("oceanfire_furnace_on", true));
        register(registry, new BlockMoltenFurnace("molten_furnace", false));
        register(registry, new BlockMoltenFurnace("molten_furnace_on", true));
        register(registry, new BlockWhitefireFurnace("whitefire_furnace", false));
        register(registry, new BlockWhitefireFurnace("whitefire_furnace_on", true));
        register(registry, new BlockMoonlightFurnace("moonlight_furnace", false));
        register(registry, new BlockMoonlightFurnace("moonlight_furnace_on", true));
        register(registry, new BlockDemonFurnace("demon_furnace", false));
        register(registry, new BlockDemonFurnace("demon_furnace_on", true));

        // Miscellaneous utility
        register(registry, new BlockAcceleron("acceleron"));
        register(registry, new BlockModTorch("arcanium_torch", ParticleType.PURPLE_FLAME));
        register(registry, new BlockElevantium("elevantium"));
        register(registry, new BlockModBridge("star_bridge", 1.5F));

        // Vethea

        // Terrain
        register(registry, new BlockModDirt("dream_dirt", 2.5F, MapColor.LIME_STAINED_HARDENED_CLAY).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModGrass("dream_grass", 2.5F, MapColor.LIGHT_BLUE).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockMod("dream_stone", 6.0F).setCreativeTab(DivineRPGTabs.vethea));

        // Logs
        register(registry, new BlockVetheaLog("dreamwood_log", MapColor.LIGHT_BLUE).setHardness(5.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockVetheaLog("firewood_log", MapColor.RED).setHardness(5.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockVetheaLog("hyrewood_log", MapColor.BLUE).setHardness(5.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockVetheaLog("mintwood_log", MapColor.LIGHT_BLUE).setHardness(5.0F).setCreativeTab(DivineRPGTabs.vethea));

        // Leaves
        register(registry, new BlockModLeaves("dreamwood_leaves", 0.1F, MapColor.RED).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModLeaves("firewood_leaves", 0.1F, MapColor.RED).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModLeaves("hyrewood_leaves", 0.1F, MapColor.RED).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModLeaves("mintwood_leaves", 0.1F, MapColor.RED).setCreativeTab(DivineRPGTabs.vethea));

        // Ground foliage
        register(registry, new BlockTwilightFlower("bulbatobe", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockTwilightFlower("cracklespike", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockTwilightFlower("dreamglow", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockTwilightFlower("fernite", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockTwilightFlower("green_dulah", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockTwilightFlower("green_gemtop", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockTwilightFlower("purple_gemtop", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockTwilightFlower("shimmer", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockTwilightFlower("shine_grass", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockTwilightFlower("yellow_dulah", dreamGrass, MapColor.GREEN).setCreativeTab(DivineRPGTabs.vethea));

        // Vines
        register(registry, new BlockModVine("weedwood_vine").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModVine("blossomed_weedwood_vine").setCreativeTab(DivineRPGTabs.vethea));

        // Building blocks
        register(registry, new BlockMod("dark_dream_bricks", 1.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockMod("light_dream_bricks", 1.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockMod("red_dream_bricks", 1.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModGlass("smooth_glass", 0.3F).setCreativeTab(DivineRPGTabs.vethea));

        // Lighting
        register(registry, new BlockModLamp(EnumBlockType.GLASS,"fire_crystal", 1.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "firelight", 1.0F).setCreativeTab(DivineRPGTabs.vethea));

        // Structure
        // General
        register(registry, new BlockDreamLamp("dream_lamp").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModUnbreakable("everstone").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModUnbreakable("dark_everstone").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModUnbreakable("white_everstone").setCreativeTab(DivineRPGTabs.vethea));

        // Crypt
        register(registry, new BlockModUnbreakable("black_hungerstone").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModUnbreakable("green_hungerstone").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModUnbreakable("crypt_floor").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockMod("crypt_wall", 1.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModGlass("metal_caging", 1.0F).setCreativeTab(DivineRPGTabs.vethea));

        // Village
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "village_lamp", 1.0F).setCreativeTab(DivineRPGTabs.vethea));

        // Hive
        register(registry, new BlockModLamp(EnumBlockType.GLASS, "cell_lamp", 1.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockMod(EnumBlockType.GLASS, "hive_wall", 1.0F).setLightLevel(0.533F).setCreativeTab(DivineRPGTabs.vethea));

        // Karos Madhouse
        register(registry, new BlockModUnbreakable("black_karos_bricks").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModUnbreakable("blue_karos_bricks").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockHelioticBeam("heliotic_beam").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockKarosCannon("karos_cannon").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockKarosHeatTile("karos_heat_tile_green").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockKarosHeatTile("karos_heat_tile_red").setCreativeTab(DivineRPGTabs.vethea));

        // Lunic Garden
        register(registry, new BlockMod("luna_bricks", 1.0F).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockMod("luna_stone", 1.0F).setCreativeTab(DivineRPGTabs.vethea));

        // Raglok Chamber
        register(registry, new BlockModUnbreakable("chamber_wall").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModUnbreakable("shifted_chamber_wall").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModUnbreakable("stacked_chamber_wall").setCreativeTab(DivineRPGTabs.vethea));

        // Wreck Hall
        register(registry, new BlockModUnbreakable("hall_wall").setCreativeTab(DivineRPGTabs.vethea));

        // Utility
        register(registry, new BlockInfusionTable("infusion_table").setCreativeTab(DivineRPGTabs.vethea));

        // Boss altars
        register(registry, new BlockKarosAltar("karos_altar").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockLunicAltar("lunic_altar").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockQuadroticAltar("quadrotic_altar").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockRaglokAltar("raglok_altar").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockWreckAltar("wreck_altar").setCreativeTab(DivineRPGTabs.vethea));

        // Mob spawners
        register(registry, new BlockModSpawner("biphron_spawner", "Biphron").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModSpawner("dreamwrecker_spawner", "Dreamwrecker").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModSpawner("gorgosion_spawner", "Gorgosion").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModSpawner("twins_spawner", "Twins").setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockModSpawner("vermenous_spawner", "Vermenous").setCreativeTab(DivineRPGTabs.vethea));

        // Acid
        register(registry, new BlockAcid("acid_block", true).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockAcid("bacterial_acid", false).setCreativeTab(DivineRPGTabs.vethea));
        register(registry, new BlockAcid("lunic_acid", true).setCreativeTab(DivineRPGTabs.vethea));

        // Portal blocks
        register(registry, new BlockNightmareBed());
        register(registry, new BlockVetheaPortal("vethea_portal", ModDimensions.vetheaDimension.getId(), ModBlocks.blueFire, ModBlocks.mortumBlock, ParticleType.MORTUM_PORTAL));
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
        for(Block block: blockList) {
            Item itemBlock = new ItemBlock(block).setRegistryName(block.getRegistryName());
            if(!itemBlock.equals(Item.getItemFromBlock(Blocks.AIR))) {
                ModelLoader.setCustomModelResourceLocation(itemBlock, 0, new ModelResourceLocation(itemBlock.getRegistryName(), "inventory"));
            }
            event.getRegistry().register(itemBlock);
        }
    }

    private static void register(IForgeRegistry<Block> registry, Block block) {
        registry.register(block);
        blockList.add(block);
    }

    /**
     * Used to retrieve blocks by registry name when they are needed to construct other blocks (e.g. for stairs and slabs).
     * This is needed because object holders are not populated until block registration is done.
     * As such, any attempt to reference the object holder before then will cause an NPE.
     *
     * @param registryName the registry name
     * @return the block matching the registry name
     */
    private static Block getBlockFromList(String registryName) {
        for(Block block: blockList) {
            if(block.getRegistryName().getResourcePath().equals(registryName)) {
                return block;
            }
        }

        return null;
    }

    /**
     * Called during FML init. May be able to move some of these to use getBlockFromList above instead
     */
    public static void blockInitTasks() {
        frozenGrass.setDirt(frozenDirt);
        edenGrass.setDirt(edenDirt);
        wildwoodGrass.setDirt(wildwoodDirt);
        apalachiaGrass.setDirt(apalachiaDirt);
        skythernGrass.setDirt(skythernDirt);
        mortumGrass.setDirt(mortumDirt);
        arcaniteGrass.setDirt(arcaniteDirt);
        dreamGrass.setDirt(dreamDirt);
    }
}