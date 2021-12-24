package mindustry.content;

import static mindustry.content.Blocks.*;
import static mindustry.content.TechTree.*;

public class ErekirTechTree{

    public static void load(){
        Planets.erekir.techTree = nodeRoot("erekir", coreBastion, true, () -> {
            node(duct, () -> {
                node(ductRouter, () -> {
                    node(ductBridge, () -> {
                        node(surgeConveyor, () -> {
                            node(surgeRouter);
                        });

                        node(unitCargoLoader, () -> {
                            node(unitCargoUnloadPoint, () -> {

                            });
                        });
                    });

                    node(overflowDuct, () -> {
                        node(ductUnloader, () -> {

                        });
                    });

                    node(reinforcedContainer, () -> {
                        node(reinforcedVault, () -> {

                        });
                    });
                });

                node(constructor, () -> {
                    node(payloadLoader, () -> {
                        node(payloadUnloader, () -> {
                            node(payloadPropulsionTower, () -> {

                            });
                        });
                    });

                    node(smallDeconstructor, () -> {
                        node(largeConstructor, () -> {

                        });

                        node(deconstructor, () -> {

                        });
                    });
                });
            });

            node(turbineCondenser, () -> {
                node(beamNode, () -> {
                    node(ventCondenser, () -> {
                        node(chemicalCombustionChamber, () -> {
                            node(pyrolysisGenerator, () -> {

                            });
                        });
                    });

                    node(beamTower, () -> {

                    });


                    node(regenProjector, () -> {
                        //TODO more tiers of build tower or "support" structures like overdrive projectors
                        node(buildTower, () -> {

                        });
                    });
                });
            });

            node(siliconArcFurnace, () -> {
                node(cliffCrusher, () -> {
                    node(electrolyzer, () -> {
                        node(oxidationChamber, () -> {
                            node(electricHeater, () -> {
                                node(heatRedirector, () -> {

                                });

                                node(atmosphericConcentrator, () -> {
                                    node(cyanogenSynthesizer, () -> {

                                    });
                                });

                                node(carbideCrucible, () -> {
                                    node(surgeCrucible, () -> {
                                        node(phaseSynthesizer, () -> {
                                            node(phaseHeater, () -> {

                                            });
                                        });
                                    });
                                });
                            });
                        });

                        node(slagIncinerator, () -> {

                            node(slagCentrifuge, () -> {

                            });

                            node(heatReactor, () -> {

                            });
                        });
                    });
                });
            });

            //TODO move into turbine condenser?
            node(plasmaBore, () -> {

                node(largePlasmaBore, () -> {

                });

                node(impactDrill, () -> {

                });
            });

            node(reinforcedConduit, () -> {
                node(reinforcedPump, () -> {
                    //TODO T2 pump
                });

                node(reinforcedLiquidJunction, () -> {
                    node(reinforcedBridgeConduit, () -> {

                    });

                    node(reinforcedLiquidRouter, () -> {
                        node(reinforcedLiquidContainer, () -> {
                            node(reinforcedLiquidTank, () -> {

                            });
                        });
                    });
                });
            });

            node(breach, () -> {
                node(berylliumWall, () -> {
                    node(berylliumWallLarge, () -> {

                    });

                    node(tungstenWall, () -> {
                        node(tungstenWallLarge, () -> {

                        });
                    });
                });

                node(fracture, () -> {

                    //TODO big tech jump here; incomplete turret
                    node(sublimate, () -> {

                    });
                });
            });

            //TODO requirements for these
            node(coreCitadel, () -> {
                node(coreAcropolis, () -> {

                });
            });

            nodeProduce(Items.beryllium, () -> {
                nodeProduce(Items.oxide, () -> {
                    nodeProduce(Items.fissileMatter, () -> {

                    });
                });

                nodeProduce(Liquids.ozone, () -> {
                    nodeProduce(Liquids.hydrogen, () -> {
                        nodeProduce(Liquids.nitrogen, () -> {
                            nodeProduce(Liquids.cyanogen, () -> {

                            });
                        });
                    });
                });

                nodeProduce(Items.tungsten, () -> {
                    nodeProduce(Items.carbide, () -> {
                        nodeProduce(Liquids.gallium, () -> {

                        });
                    });
                });
            });

        });
    }
}
