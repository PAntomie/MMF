package io.github.PAntomie.mmf.mixin;


import net.minecraft.client.Camera;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Camera.class)
public class CameraMixin {
    @Invoker("setPosition")
    void invokeSetPoition(Vec3 pos);
}
