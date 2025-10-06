package europa.content

import arc.Core;
import arc.graphics.Color;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.MultiEffect;
import mindustry.entities.effect.ParticleEffect;
import mindustry.entities.effect.WaveEffect;
import mindustry.entities.part.RegionPart;
import mindustry.entities.pattern.ShootBarrel;
import mindustry.gen.Sounds;
import mindustry.graphics.CacheLayer;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.type.unit.MissileUnitType;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.world.blocks.distribution.BufferedItemBridge;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.distribution.Router;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.liquid.Conduit;
import mindustry.world.blocks.liquid.LiquidBridge;
import mindustry.world.blocks.liquid.LiquidRouter;
import mindustry.world.blocks.power.Battery;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.blocks.units.Reconstructor;
import mindustry.world.blocks.units.UnitCargoLoader;
import mindustry.world.blocks.units.UnitCargoUnloadPoint;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.type.Category.*;
import static mindustry.type.ItemStack.with;

public class EuropaBlocks {
    public static Block 
            // liquids
       //     copperPump, 
            // distribution
            floatingPipeline,
            // drills
            seabedDriller,
            // env

            // props

            // turrets

            // power
         //   rustGenerator, powerNode,
            // production
    //        concreteMixer, sieve,
            // defence

            // units

            // cores
            coreSeadrome
    ;
    public static void load() {
        floatingPipeline = new Duct("floating-pipeline"){{
            requirements(Category.distribution, with(Items.copper, 1));
            health = 90;
            speed = 4f;
            researchCost = with(Items.copper, 5);
        }};
        coreSeadrome = new CoreBlock("core-seadrome"){{
            requirements(Category.effect, BuildVisibility.coreZoneOnly, with(Items.copper, 1000, EuropaItems.lime, 800));
            alwaysUnlocked = true;

            isFirstTier = true;
            unitType = EuropaUnits.nautilus;
            health = 1100;
            itemCapacity = 4400;
            size = 3;
            buildCostMultiplier = 2f;

            unitCapModifier = 8;
        }};
        seabedDriller = new Drill("seabedDriller"){{
            requirements(Category.production, with(Items.copper, 12));
            tier = 2;
            drillTime = 600;
            size = 2;
            //drill doesn't work in space
            envEnabled ^= Env.space;
            researchCost = with(Items.copper, 10);
        }};
    }
}
