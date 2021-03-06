package divinerpg.objects.entities.assets.render.vethea;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vethea.ModelHiveQueen;
import divinerpg.objects.entities.entity.vethea.EntityHiveQueen;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderHiveQueen extends RenderLiving<EntityHiveQueen> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/hive_queen.png");
	private final ModelHiveQueen modelEntity;
    
	public RenderHiveQueen(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelHiveQueen(), 1F);
        modelEntity = (ModelHiveQueen) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityHiveQueen entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<EntityHiveQueen> {

	        @Override
	        public Render<? super EntityHiveQueen> createRenderFor(RenderManager manager) {
	            return new RenderHiveQueen(manager, new ModelHiveQueen(), 1F);
	        }
	    }

	}