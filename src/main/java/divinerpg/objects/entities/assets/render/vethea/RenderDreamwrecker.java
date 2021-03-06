package divinerpg.objects.entities.assets.render.vethea;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vethea.ModelDreamwrecker;
import divinerpg.objects.entities.entity.vethea.EntityDreamwrecker;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDreamwrecker extends RenderLiving<EntityDreamwrecker> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/dreamwrecker.png");
	private final ModelDreamwrecker modelEntity;
    
	public RenderDreamwrecker(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelDreamwrecker(), 1F);
        modelEntity = (ModelDreamwrecker) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityDreamwrecker entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<EntityDreamwrecker> {

	        @Override
	        public Render<? super EntityDreamwrecker> createRenderFor(RenderManager manager) {
	            return new RenderDreamwrecker(manager, new ModelDreamwrecker(), 1F);
	        }
	    }

	}