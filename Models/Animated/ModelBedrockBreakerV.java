/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 06/04/2013 2:40:35 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;


public class ModelBedrockBreakerV extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape3d;
	LODModelPart Shape3e;
	LODModelPart Shape3f;
	LODModelPart Shape3g;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape3h;
	LODModelPart Shape3i;
	LODModelPart Shape3j;
	LODModelPart Shape3k;
	LODModelPart Shape3cc;
	LODModelPart Shape3l;
	LODModelPart Shape3m;
	LODModelPart Shape3n;
	LODModelPart Shape3o;
	LODModelPart Shape3p;
	LODModelPart Shape3q;
	LODModelPart Shape3r;
	LODModelPart Shape3s;
	LODModelPart Shape3t;
	LODModelPart Shape3u;
	LODModelPart Shape3v;
	LODModelPart Shape3w;
	LODModelPart Shape3x;
	LODModelPart Shape3y;
	LODModelPart Shape3z;
	LODModelPart Shape3aa;
	LODModelPart Shape3bb;
	LODModelPart Shape3cca;
	LODModelPart Shape3dd;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;

	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape7b;
	LODModelPart Shape7c;
	LODModelPart Shape7d;
	LODModelPart Shape7e;
	LODModelPart Shape7f;
	LODModelPart Shape7g;

	public ModelBedrockBreakerV()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 38, 0);
		Shape1.addBox(0F, 0F, 0F, 12, 16, 16);
		Shape1.setRotationPoint(-7F, 8F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape3.setRotationPoint(7F, 16F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0.7853982F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 0);
		Shape3a.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape3a.setRotationPoint(7F, 16F, 0F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, -1.570796F, 0F, 0F);
		Shape3b = new LODModelPart(this, 0, 0);
		Shape3b.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape3b.setRotationPoint(7F, 16F, 0F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, -0.7853982F, 0F, 0F);
		Shape3c = new LODModelPart(this, 0, 0);
		Shape3c.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape3c.setRotationPoint(7F, 16F, 0F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 2.356194F, 0F, 0F);
		Shape3d = new LODModelPart(this, 0, 0);
		Shape3d.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape3d.setRotationPoint(7F, 16F, 0F);
		Shape3d.setTextureSize(128, 128);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, -2.356194F, 0F, 0F);
		Shape3e = new LODModelPart(this, 0, 0);
		Shape3e.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape3e.setRotationPoint(7F, 16F, 0F);
		Shape3e.setTextureSize(128, 128);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 1.570796F, 0F, 0F);
		Shape3f = new LODModelPart(this, 0, 0);
		Shape3f.addBox(0F, 3F, -1F, 1, 4, 1);
		Shape3f.setRotationPoint(7F, 16F, 0F);
		Shape3f.setTextureSize(128, 128);
		Shape3f.mirror = true;
		this.setRotation(Shape3f, -0.7853982F, 0F, 0F);
		Shape3g = new LODModelPart(this, 0, 0);
		Shape3g.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape3g.setRotationPoint(7F, 16F, 0F);
		Shape3g.setTextureSize(128, 128);
		Shape3g.mirror = true;
		this.setRotation(Shape3g, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 38);
		Shape2.addBox(0F, 0F, 0F, 1, 14, 14);
		Shape2.setRotationPoint(6F, 9F, -7F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 8);
		Shape2a.addBox(0F, 0F, 0F, 1, 15, 15);
		Shape2a.setRotationPoint(5F, 8.5F, -7.5F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3h = new LODModelPart(this, 0, 0);
		Shape3h.addBox(0F, 3.5F, 1F, 1, 3, 1);
		Shape3h.setRotationPoint(7F, 16F, 0F);
		Shape3h.setTextureSize(128, 128);
		Shape3h.mirror = true;
		this.setRotation(Shape3h, 0F, 0F, 0F);
		Shape3i = new LODModelPart(this, 0, 0);
		Shape3i.addBox(0F, 3F, -1F, 1, 4, 1);
		Shape3i.setRotationPoint(7F, 16F, 0F);
		Shape3i.setTextureSize(128, 128);
		Shape3i.mirror = true;
		this.setRotation(Shape3i, -1.570796F, 0F, 0F);
		Shape3j = new LODModelPart(this, 0, 0);
		Shape3j.addBox(0F, 3F, -1F, 1, 4, 1);
		Shape3j.setRotationPoint(7F, 16F, 0F);
		Shape3j.setTextureSize(128, 128);
		Shape3j.mirror = true;
		this.setRotation(Shape3j, 0F, 0F, 0F);
		Shape3k = new LODModelPart(this, 0, 0);
		Shape3k.addBox(0F, 3F, -1F, 1, 4, 1);
		Shape3k.setRotationPoint(7F, 16F, 0F);
		Shape3k.setTextureSize(128, 128);
		Shape3k.mirror = true;
		this.setRotation(Shape3k, 1.570796F, 0F, 0F);
		Shape3cc = new LODModelPart(this, 0, 0);
		Shape3cc.addBox(0F, 3F, -1F, 1, 4, 1);
		Shape3cc.setRotationPoint(7F, 16F, 0F);
		Shape3cc.setTextureSize(128, 128);
		Shape3cc.mirror = true;
		this.setRotation(Shape3cc, 0.7853982F, 0F, 0F);
		Shape3l = new LODModelPart(this, 0, 0);
		Shape3l.addBox(0F, 3F, -1F, 1, 4, 1);
		Shape3l.setRotationPoint(7F, 16F, 0F);
		Shape3l.setTextureSize(128, 128);
		Shape3l.mirror = true;
		this.setRotation(Shape3l, 2.356194F, 0F, 0F);
		Shape3m = new LODModelPart(this, 0, 0);
		Shape3m.addBox(0F, 3F, -1F, 1, 4, 1);
		Shape3m.setRotationPoint(7F, 16F, 0F);
		Shape3m.setTextureSize(128, 128);
		Shape3m.mirror = true;
		this.setRotation(Shape3m, -2.356194F, 0F, 0F);
		Shape3n = new LODModelPart(this, 0, 0);
		Shape3n.addBox(0F, 5F, -2F, 1, 2, 1);
		Shape3n.setRotationPoint(7F, 16F, 0F);
		Shape3n.setTextureSize(128, 128);
		Shape3n.mirror = true;
		this.setRotation(Shape3n, 0F, 0F, 0F);
		Shape3o = new LODModelPart(this, 0, 0);
		Shape3o.addBox(0F, 3F, -1F, 1, 4, 1);
		Shape3o.setRotationPoint(7F, 16F, 0F);
		Shape3o.setTextureSize(128, 128);
		Shape3o.mirror = true;
		this.setRotation(Shape3o, 3.141593F, 0F, 0F);
		Shape3p = new LODModelPart(this, 0, 0);
		Shape3p.addBox(0F, 5F, -2F, 1, 2, 1);
		Shape3p.setRotationPoint(7F, 16F, 0F);
		Shape3p.setTextureSize(128, 128);
		Shape3p.mirror = true;
		this.setRotation(Shape3p, -2.356194F, 0F, 0F);
		Shape3q = new LODModelPart(this, 0, 0);
		Shape3q.addBox(0F, 5F, -2F, 1, 2, 1);
		Shape3q.setRotationPoint(7F, 16F, 0F);
		Shape3q.setTextureSize(128, 128);
		Shape3q.mirror = true;
		this.setRotation(Shape3q, 1.570796F, 0F, 0F);
		Shape3r = new LODModelPart(this, 0, 0);
		Shape3r.addBox(0F, 5F, -2F, 1, 2, 1);
		Shape3r.setRotationPoint(7F, 16F, 0F);
		Shape3r.setTextureSize(128, 128);
		Shape3r.mirror = true;
		this.setRotation(Shape3r, 0.7853982F, 0F, 0F);
		Shape3s = new LODModelPart(this, 0, 0);
		Shape3s.addBox(0F, 5F, -2F, 1, 2, 1);
		Shape3s.setRotationPoint(7F, 16F, 0F);
		Shape3s.setTextureSize(128, 128);
		Shape3s.mirror = true;
		this.setRotation(Shape3s, -1.570796F, 0F, 0F);
		Shape3t = new LODModelPart(this, 0, 0);
		Shape3t.addBox(0F, 5F, -2F, 1, 2, 1);
		Shape3t.setRotationPoint(7F, 16F, 0F);
		Shape3t.setTextureSize(128, 128);
		Shape3t.mirror = true;
		this.setRotation(Shape3t, -0.7853982F, 0F, 0F);
		Shape3u = new LODModelPart(this, 0, 0);
		Shape3u.addBox(0F, 5F, -2F, 1, 2, 1);
		Shape3u.setRotationPoint(7F, 16F, 0F);
		Shape3u.setTextureSize(128, 128);
		Shape3u.mirror = true;
		this.setRotation(Shape3u, 2.356194F, 0F, 0F);
		Shape3v = new LODModelPart(this, 0, 0);
		Shape3v.addBox(0F, 5F, -2F, 1, 2, 1);
		Shape3v.setRotationPoint(7F, 16F, 0F);
		Shape3v.setTextureSize(128, 128);
		Shape3v.mirror = true;
		this.setRotation(Shape3v, 3.141593F, 0F, 0F);
		Shape3w = new LODModelPart(this, 0, 0);
		Shape3w.addBox(0F, 0F, 0F, 1, 7, 1);
		Shape3w.setRotationPoint(7F, 16F, 0F);
		Shape3w.setTextureSize(128, 128);
		Shape3w.mirror = true;
		this.setRotation(Shape3w, 3.141593F, 0F, 0F);
		Shape3x = new LODModelPart(this, 0, 0);
		Shape3x.addBox(0F, 3.5F, 1F, 1, 3, 1);
		Shape3x.setRotationPoint(7F, 16F, 0F);
		Shape3x.setTextureSize(128, 128);
		Shape3x.mirror = true;
		this.setRotation(Shape3x, 2.356194F, 0F, 0F);
		Shape3y = new LODModelPart(this, 0, 0);
		Shape3y.addBox(0F, 3.5F, 1F, 1, 3, 1);
		Shape3y.setRotationPoint(7F, 16F, 0F);
		Shape3y.setTextureSize(128, 128);
		Shape3y.mirror = true;
		this.setRotation(Shape3y, 1.570796F, 0F, 0F);
		Shape3z = new LODModelPart(this, 0, 0);
		Shape3z.addBox(0F, 3.5F, 1F, 1, 3, 1);
		Shape3z.setRotationPoint(7F, 16F, 0F);
		Shape3z.setTextureSize(128, 128);
		Shape3z.mirror = true;
		this.setRotation(Shape3z, -2.356194F, 0F, 0F);
		Shape3aa = new LODModelPart(this, 0, 0);
		Shape3aa.addBox(0F, 3.5F, 1F, 1, 3, 1);
		Shape3aa.setRotationPoint(7F, 16F, 0F);
		Shape3aa.setTextureSize(128, 128);
		Shape3aa.mirror = true;
		this.setRotation(Shape3aa, 0.7853982F, 0F, 0F);
		Shape3bb = new LODModelPart(this, 0, 0);
		Shape3bb.addBox(0F, 3.5F, 1F, 1, 3, 1);
		Shape3bb.setRotationPoint(7F, 16F, 0F);
		Shape3bb.setTextureSize(128, 128);
		Shape3bb.mirror = true;
		this.setRotation(Shape3bb, -0.7853982F, 0F, 0F);
		Shape3cca = new LODModelPart(this, 0, 0);
		Shape3cca.addBox(0F, 3.5F, 1F, 1, 3, 1);
		Shape3cca.setRotationPoint(7F, 16F, 0F);
		Shape3cca.setTextureSize(128, 128);
		Shape3cca.mirror = true;
		this.setRotation(Shape3cca, -1.570796F, 0F, 0F);
		Shape3dd = new LODModelPart(this, 0, 0);
		Shape3dd.addBox(0F, 3.5F, 1F, 1, 3, 1);
		Shape3dd.setRotationPoint(7F, 16F, 0F);
		Shape3dd.setTextureSize(128, 128);
		Shape3dd.mirror = true;
		this.setRotation(Shape3dd, 3.141593F, 0F, 0F);
		Shape4 = new LODModelPart(this, 0, 88);
		Shape4.addBox(0F, 0F, 0F, 1, 6, 16);
		Shape4.setRotationPoint(-8F, 18F, -8F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 0, 110);
		Shape4a.addBox(0F, 0F, 0F, 1, 4, 6);
		Shape4a.setRotationPoint(-8F, 14F, 2F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 0, 66);
		Shape4b.addBox(0F, 0F, 0F, 1, 6, 16);
		Shape4b.setRotationPoint(-8F, 8F, -8F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new LODModelPart(this, 14, 110);
		Shape4c.addBox(0F, 0F, 0F, 1, 4, 6);
		Shape4c.setRotationPoint(-8F, 14F, -8F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);

		Shape7 = new LODModelPart(this, 40, 70);
		Shape7.addBox(0F, -7F, -1F, 16, 1, 3);
		Shape7.setRotationPoint(8F, 16F, 0F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, -2.356194F, 0F, 0F);
		Shape7a = new LODModelPart(this, 40, 70);
		Shape7a.addBox(0F, -7F, -1F, 16, 1, 3);
		Shape7a.setRotationPoint(8F, 16F, 0F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape7b = new LODModelPart(this, 40, 70);
		Shape7b.addBox(0F, -7F, -1F, 16, 1, 3);
		Shape7b.setRotationPoint(8F, 16F, 0F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0.7853982F, 0F, 0F);
		Shape7c = new LODModelPart(this, 40, 70);
		Shape7c.addBox(0F, -7F, -1F, 16, 1, 3);
		Shape7c.setRotationPoint(8F, 16F, 0F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 1.570796F, 0F, 0F);
		Shape7d = new LODModelPart(this, 40, 70);
		Shape7d.addBox(0F, -7F, -1F, 16, 1, 3);
		Shape7d.setRotationPoint(8F, 16F, 0F);
		Shape7d.setTextureSize(128, 128);
		Shape7d.mirror = true;
		this.setRotation(Shape7d, 2.356194F, 0F, 0F);
		Shape7e = new LODModelPart(this, 40, 70);
		Shape7e.addBox(0F, -7F, -1F, 16, 1, 3);
		Shape7e.setRotationPoint(8F, 16F, 0F);
		Shape7e.setTextureSize(128, 128);
		Shape7e.mirror = true;
		this.setRotation(Shape7e, 3.141593F, 0F, 0F);
		Shape7f = new LODModelPart(this, 40, 70);
		Shape7f.addBox(0F, -7F, -1F, 16, 1, 3);
		Shape7f.setRotationPoint(8F, 16F, 0F);
		Shape7f.setTextureSize(128, 128);
		Shape7f.mirror = true;
		this.setRotation(Shape7f, -0.7853982F, 0F, 0F);
		Shape7g = new LODModelPart(this, 40, 70);
		Shape7g.addBox(0F, -7F, -1F, 16, 1, 3);
		Shape7g.setRotationPoint(8F, 16F, 0F);
		Shape7g.setTextureSize(128, 128);
		Shape7g.mirror = true;
		this.setRotation(Shape7g, -1.570796F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		int step = (Integer)li.get(0);
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);
		Shape3d.render(te, f5);
		Shape3e.render(te, f5);
		Shape3f.render(te, f5);
		Shape3g.render(te, f5);
		Shape3h.render(te, f5);
		Shape3i.render(te, f5);
		Shape3j.render(te, f5);
		Shape3k.render(te, f5);
		Shape3cc.render(te, f5);
		Shape3l.render(te, f5);
		Shape3m.render(te, f5);
		Shape3n.render(te, f5);
		Shape3o.render(te, f5);
		Shape3p.render(te, f5);
		Shape3q.render(te, f5);
		Shape3r.render(te, f5);
		Shape3s.render(te, f5);
		Shape3t.render(te, f5);
		Shape3u.render(te, f5);
		Shape3v.render(te, f5);
		Shape3w.render(te, f5);
		Shape3x.render(te, f5);
		Shape3y.render(te, f5);
		Shape3z.render(te, f5);
		Shape3aa.render(te, f5);
		Shape3bb.render(te, f5);
		Shape3cca.render(te, f5);
		Shape3dd.render(te, f5);

		for (int i = 1; i < step; i++) {
			int a = i-1;
			GL11.glTranslated(a, 0, 0);
			Shape7.render(te, f5);
			Shape7a.render(te, f5);
			Shape7b.render(te, f5);
			Shape7c.render(te, f5);
			Shape7d.render(te, f5);
			Shape7e.render(te, f5);
			Shape7f.render(te, f5);
			Shape7g.render(te, f5);
			GL11.glTranslated(-a, 0, 0);
		}

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape4b.render(te, f5);
		Shape4c.render(te, f5);
	}
}
