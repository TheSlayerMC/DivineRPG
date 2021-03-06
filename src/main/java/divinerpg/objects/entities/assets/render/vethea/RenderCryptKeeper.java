package divinerpg.objects.entities.assets.render.vethea;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vethea.ModelCryptKeeper;
import divinerpg.objects.entities.entity.vethea.EntityCryptKeeper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderCryptKeeper extends RenderLiving<EntityCryptKeeper> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/crypt_keeper.png");
	private final ModelCryptKeeper modelEntity;
    
	public RenderCryptKeeper(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelCryptKeeper(), 1F);
        modelEntity = (ModelCryptKeeper) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityCryptKeeper entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<EntityCryptKeeper> {

	        @Override
	        public Render<? super EntityCryptKeeper> createRenderFor(RenderManager manager) {
	            return new RenderCryptKeeper(manager, new ModelCryptKeeper(), 1F);
	        }
	    }

	}