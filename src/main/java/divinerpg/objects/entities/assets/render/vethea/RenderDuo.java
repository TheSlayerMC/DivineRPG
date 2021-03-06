package divinerpg.objects.entities.assets.render.vethea;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vethea.ModelDuo;
import divinerpg.objects.entities.entity.vethea.EntityDuo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDuo extends RenderLiving<EntityDuo> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/duo.png");
	private final ModelDuo modelEntity;
    
	public RenderDuo(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelDuo(), 1F);
        modelEntity = (ModelDuo) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityDuo entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<EntityDuo> {

	        @Override
	        public Render<? super EntityDuo> createRenderFor(RenderManager manager) {
	            return new RenderDuo(manager, new ModelDuo(), 1F);
	        }
	    }

	}