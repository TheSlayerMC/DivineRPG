package divinerpg.entities.eden.bunny.pet;

import divinerpg.entities.base.DivineRender;
import divinerpg.utils.CachedTexture;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

public class BunnyRender extends DivineRender<Bunny, BunnyModel> {
    public BunnyRender(EntityRendererManager manager) {
        super(manager, new BunnyModel(), 0, "");
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(Bunny entity) {
        if (entity.isTamed()) {
            return entity.isAggressive()
                    // texture is jumping from aggressive to regular.
                    // I think it is because of revenge goal
                    ? CachedTexture.ENTITIES.getTexture("tamed_angry_bunny")
                    : CachedTexture.ENTITIES.getTexture("tamed_bunny");
        }

        return CachedTexture.ENTITIES.getTexture("bunny");
    }

    @Override
    protected void preRenderCallback(Bunny bunny, float partialTickTime) {
        super.preRenderCallback(bunny, partialTickTime);

        if (bunny.isTamed() && bunny.isAggressive()) {
            GL11.glScaled(1.2, 1.2, 1.2);
        }
    }
}