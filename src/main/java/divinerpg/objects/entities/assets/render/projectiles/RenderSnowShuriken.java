package divinerpg.objects.entities.assets.render.projectiles;

import divinerpg.objects.entities.entity.projectiles.EntitySnowflakeShuriken;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSnowShuriken extends RenderProjectile<EntitySnowflakeShuriken> {
	private ResourceLocation TEXTURE = new ResourceLocation("divinerpg:textures/items/snowflake_shuriken.png");

	public RenderSnowShuriken(RenderManager manager, float scaleIn) {
		super(manager, scaleIn);
		this.bindTexture(TEXTURE);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySnowflakeShuriken entity) {
		return TEXTURE;
	}
}