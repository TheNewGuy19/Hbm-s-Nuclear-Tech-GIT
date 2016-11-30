// Date: 26.11.2016 20:13:04
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.hbm.render.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCryolator extends ModelBase {
	// fields
	ModelRenderer Body;
	ModelRenderer Barrel1;
	ModelRenderer Barrel2;
	ModelRenderer BarrelBack;
	ModelRenderer BarrelNozzle;
	ModelRenderer TankF1;
	ModelRenderer TankF2;
	ModelRenderer TankF3;
	ModelRenderer TankB1;
	ModelRenderer TankB2;
	ModelRenderer TankB3;
	ModelRenderer Drum1;
	ModelRenderer Drum2;
	ModelRenderer BodyBACK;
	ModelRenderer PipeLPlate;
	ModelRenderer BodyBottom;
	ModelRenderer Handle;
	ModelRenderer Trigger;
	ModelRenderer CoolingBlock;
	ModelRenderer BodyCenter;
	ModelRenderer PipeRPlate;
	ModelRenderer StockTop;
	ModelRenderer StockFront;
	ModelRenderer StockBack;
	ModelRenderer StockBottom;
	ModelRenderer PipeLPlateB;
	ModelRenderer PipeRPlateB;
	ModelRenderer StockConnector;
	ModelRenderer PipeTL;
	ModelRenderer PipeBL;
	ModelRenderer PipeTR;
	ModelRenderer PipeBR;
	ModelRenderer PipeL;
	ModelRenderer PipiR;
	ModelRenderer ConnectorFront;
	ModelRenderer ConnectorBFront;
	ModelRenderer ConnectorBBack;
	ModelRenderer Connector;
	ModelRenderer ConnectorStrut;
	ModelRenderer PipeLarge;
	ModelRenderer PipeLargeBack;
	ModelRenderer PipiLargeConnector;
	ModelRenderer PlateFront;
	ModelRenderer ScaffoldFront;
	ModelRenderer ScaffoldBottom;
	ModelRenderer ScaffoldBack;

	public ModelCryolator() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new ModelRenderer(this, 0, 6);
		Body.addBox(0F, 0F, 0F, 15, 2, 3);
		Body.setRotationPoint(-12F, 0F, -1.5F);
		Body.setTextureSize(128, 64);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		Barrel1 = new ModelRenderer(this, 0, 57);
		Barrel1.addBox(0F, 0F, 0F, 2, 4, 3);
		Barrel1.setRotationPoint(-15F, 0F, -1.5F);
		Barrel1.setTextureSize(128, 64);
		Barrel1.mirror = true;
		setRotation(Barrel1, 0F, 0F, 0F);
		Barrel2 = new ModelRenderer(this, 10, 57);
		Barrel2.addBox(0F, 0F, 0F, 2, 3, 4);
		Barrel2.setRotationPoint(-15F, 0.5F, -2F);
		Barrel2.setTextureSize(128, 64);
		Barrel2.mirror = true;
		setRotation(Barrel2, 0F, 0F, 0F);
		BarrelBack = new ModelRenderer(this, 0, 51);
		BarrelBack.addBox(0F, 0F, 0F, 1, 3, 3);
		BarrelBack.setRotationPoint(-13F, 0.5F, -1.5F);
		BarrelBack.setTextureSize(128, 64);
		BarrelBack.mirror = true;
		setRotation(BarrelBack, 0F, 0F, 0F);
		BarrelNozzle = new ModelRenderer(this, 0, 49);
		BarrelNozzle.addBox(0F, 0F, 0F, 1, 1, 1);
		BarrelNozzle.setRotationPoint(-15.5F, 0.5F, -0.5F);
		BarrelNozzle.setTextureSize(128, 64);
		BarrelNozzle.mirror = true;
		setRotation(BarrelNozzle, 0F, 0F, 0F);
		TankF1 = new ModelRenderer(this, 22, 55);
		TankF1.addBox(0F, 0F, 0F, 4, 5, 4);
		TankF1.setRotationPoint(-10.5F, 2F, -2F);
		TankF1.setTextureSize(128, 64);
		TankF1.mirror = true;
		setRotation(TankF1, 0F, 0F, 0F);
		TankF2 = new ModelRenderer(this, 38, 56);
		TankF2.addBox(0F, 0F, 0F, 6, 4, 4);
		TankF2.setRotationPoint(-11.5F, 2.5F, -2F);
		TankF2.setTextureSize(128, 64);
		TankF2.mirror = true;
		setRotation(TankF2, 0F, 0F, 0F);
		TankF3 = new ModelRenderer(this, 58, 55);
		TankF3.addBox(0F, 0F, 0F, 4, 4, 5);
		TankF3.setRotationPoint(-10.5F, 2.5F, -2.5F);
		TankF3.setTextureSize(128, 64);
		TankF3.mirror = true;
		setRotation(TankF3, 0F, 0F, 0F);
		TankB1 = new ModelRenderer(this, 8, 52);
		TankB1.addBox(0F, 0F, 0F, 4, 2, 3);
		TankB1.setRotationPoint(-5F, 3F, -1.5F);
		TankB1.setTextureSize(128, 64);
		TankB1.mirror = true;
		setRotation(TankB1, 0F, 0F, 0F);
		TankB2 = new ModelRenderer(this, 0, 42);
		TankB2.addBox(0F, 0F, 0F, 2, 4, 3);
		TankB2.setRotationPoint(-4F, 2F, -1.5F);
		TankB2.setTextureSize(128, 64);
		TankB2.mirror = true;
		setRotation(TankB2, 0F, 0F, 0F);
		TankB3 = new ModelRenderer(this, 0, 36);
		TankB3.addBox(0F, 0F, 0F, 2, 2, 4);
		TankB3.setRotationPoint(-4F, 3F, -2F);
		TankB3.setTextureSize(128, 64);
		TankB3.mirror = true;
		setRotation(TankB3, 0F, 0F, 0F);
		Drum1 = new ModelRenderer(this, 38, 49);
		Drum1.addBox(0F, 0F, 0F, 6, 4, 3);
		Drum1.setRotationPoint(-2F, 6F, -4F);
		Drum1.setTextureSize(128, 64);
		Drum1.mirror = true;
		setRotation(Drum1, 0F, 0F, 0F);
		Drum2 = new ModelRenderer(this, 24, 46);
		Drum2.addBox(0F, 0F, 0F, 4, 6, 3);
		Drum2.setRotationPoint(-1F, 5F, -4F);
		Drum2.setTextureSize(128, 64);
		Drum2.mirror = true;
		setRotation(Drum2, 0F, 0F, 0F);
		BodyBACK = new ModelRenderer(this, 38, 44);
		BodyBACK.addBox(0F, 0F, 0F, 7, 2, 3);
		BodyBACK.setRotationPoint(3F, 0F, -1.5F);
		BodyBACK.setTextureSize(128, 64);
		BodyBACK.mirror = true;
		setRotation(BodyBACK, 0F, 0F, 0.2617994F);
		PipeLPlate = new ModelRenderer(this, 10, 46);
		PipeLPlate.addBox(0F, 0F, 0F, 2, 4, 2);
		PipeLPlate.setRotationPoint(-1F, 1F, -3F);
		PipeLPlate.setTextureSize(128, 64);
		PipeLPlate.mirror = true;
		setRotation(PipeLPlate, 0F, 0F, 0F);
		BodyBottom = new ModelRenderer(this, 26, 41);
		BodyBottom.addBox(0F, 0F, 0F, 4, 3, 2);
		BodyBottom.setRotationPoint(3F, 2F, -1F);
		BodyBottom.setTextureSize(128, 64);
		BodyBottom.mirror = true;
		setRotation(BodyBottom, 0F, 0F, 0F);
		Handle = new ModelRenderer(this, 0, 29);
		Handle.addBox(0F, 0F, 0F, 2, 5, 2);
		Handle.setRotationPoint(5F, 5F, -1F);
		Handle.setTextureSize(128, 64);
		Handle.mirror = true;
		setRotation(Handle, 0F, 0F, -0.2617994F);
		Trigger = new ModelRenderer(this, 10, 43);
		Trigger.addBox(0F, 0F, 0F, 3, 2, 1);
		Trigger.setRotationPoint(3F, 5F, -0.5F);
		Trigger.setTextureSize(128, 64);
		Trigger.mirror = true;
		setRotation(Trigger, 0F, 0F, 0F);
		CoolingBlock = new ModelRenderer(this, 58, 46);
		CoolingBlock.addBox(0F, 0F, 0F, 3, 6, 3);
		CoolingBlock.setRotationPoint(-1F, 6F, 0.5F);
		CoolingBlock.setTextureSize(128, 64);
		CoolingBlock.mirror = true;
		setRotation(CoolingBlock, 0F, 0F, 0.2617994F);
		BodyCenter = new ModelRenderer(this, 12, 33);
		BodyCenter.addBox(0F, 0F, 0F, 3, 8, 2);
		BodyCenter.setRotationPoint(-0.5F, 2F, -1F);
		BodyCenter.setTextureSize(128, 64);
		BodyCenter.mirror = true;
		setRotation(BodyCenter, 0F, 0F, 0F);
		PipeRPlate = new ModelRenderer(this, 0, 21);
		PipeRPlate.addBox(0F, 0F, 0F, 2, 6, 2);
		PipeRPlate.setRotationPoint(-1F, 1F, 1F);
		PipeRPlate.setTextureSize(128, 64);
		PipeRPlate.mirror = true;
		setRotation(PipeRPlate, 0F, 0F, 0F);
		StockTop = new ModelRenderer(this, 38, 39);
		StockTop.addBox(0F, 0F, 0F, 6, 2, 3);
		StockTop.setRotationPoint(9F, 1.8F, -1.5F);
		StockTop.setTextureSize(128, 64);
		StockTop.mirror = true;
		setRotation(StockTop, 0F, 0F, 0F);
		StockFront = new ModelRenderer(this, 30, 34);
		StockFront.addBox(0F, 0F, 0F, 2, 5, 2);
		StockFront.setRotationPoint(10F, 3F, -1F);
		StockFront.setTextureSize(128, 64);
		StockFront.mirror = true;
		setRotation(StockFront, 0F, 0F, 0F);
		StockBack = new ModelRenderer(this, 38, 32);
		StockBack.addBox(0F, 0F, 0F, 2, 5, 2);
		StockBack.setRotationPoint(13F, 3F, -1F);
		StockBack.setTextureSize(128, 64);
		StockBack.mirror = true;
		setRotation(StockBack, 0F, 0F, 0F);
		StockBottom = new ModelRenderer(this, 46, 35);
		StockBottom.addBox(0F, 0F, 0F, 1, 2, 2);
		StockBottom.setRotationPoint(12F, 6F, -1F);
		StockBottom.setTextureSize(128, 64);
		StockBottom.mirror = true;
		setRotation(StockBottom, 0F, 0F, 0F);
		PipeLPlateB = new ModelRenderer(this, 8, 28);
		PipeLPlateB.addBox(0F, 0F, 0F, 3, 3, 2);
		PipeLPlateB.setRotationPoint(4F, 2F, -3F);
		PipeLPlateB.setTextureSize(128, 64);
		PipeLPlateB.mirror = true;
		setRotation(PipeLPlateB, 0F, 0F, 0F);
		PipeRPlateB = new ModelRenderer(this, 8, 23);
		PipeRPlateB.addBox(0F, 0F, 0F, 3, 3, 2);
		PipeRPlateB.setRotationPoint(4F, 2F, 1F);
		PipeRPlateB.setTextureSize(128, 64);
		PipeRPlateB.mirror = true;
		setRotation(PipeRPlateB, 0F, 0F, 0F);
		StockConnector = new ModelRenderer(this, 22, 30);
		StockConnector.addBox(0F, -1F, 0F, 5, 1, 3);
		StockConnector.setRotationPoint(6F, 5F, -1.5F);
		StockConnector.setTextureSize(128, 64);
		StockConnector.mirror = true;
		setRotation(StockConnector, 0F, 0F, 0.3490659F);
		PipeTL = new ModelRenderer(this, 58, 44);
		PipeTL.addBox(0F, 0F, 0F, 12, 1, 1);
		PipeTL.setRotationPoint(-3F, 2.3F, -2.5F);
		PipeTL.setTextureSize(128, 64);
		PipeTL.mirror = true;
		setRotation(PipeTL, 0F, 0F, 0F);
		PipeBL = new ModelRenderer(this, 56, 40);
		PipeBL.addBox(0F, 0F, 0F, 10, 1, 1);
		PipeBL.setRotationPoint(-1F, 3.7F, -2.5F);
		PipeBL.setTextureSize(128, 64);
		PipeBL.mirror = true;
		setRotation(PipeBL, 0F, 0F, 0F);
		PipeTR = new ModelRenderer(this, 56, 42);
		PipeTR.addBox(0F, 0F, 0F, 12, 1, 1);
		PipeTR.setRotationPoint(-3F, 2.3F, 1.5F);
		PipeTR.setTextureSize(128, 64);
		PipeTR.mirror = true;
		setRotation(PipeTR, 0F, 0F, 0F);
		PipeBR = new ModelRenderer(this, 56, 38);
		PipeBR.addBox(0F, 0F, 0F, 10, 1, 1);
		PipeBR.setRotationPoint(-1F, 3.7F, 1.5F);
		PipeBR.setTextureSize(128, 64);
		PipeBR.mirror = true;
		setRotation(PipeBR, 0F, 0F, 0F);
		PipeL = new ModelRenderer(this, 52, 36);
		PipeL.addBox(0F, 0F, 0F, 11, 1, 1);
		PipeL.setRotationPoint(-13F, 1.5F, -2.5F);
		PipeL.setTextureSize(128, 64);
		PipeL.mirror = true;
		setRotation(PipeL, 0F, 0F, 0F);
		PipiR = new ModelRenderer(this, 52, 34);
		PipiR.addBox(0F, 0F, 0F, 11, 1, 1);
		PipiR.setRotationPoint(-13F, 1.5F, 1.5F);
		PipiR.setTextureSize(128, 64);
		PipiR.mirror = true;
		setRotation(PipiR, 0F, 0F, 0F);
		ConnectorFront = new ModelRenderer(this, 0, 17);
		ConnectorFront.addBox(0F, 0F, 0F, 3, 3, 1);
		ConnectorFront.setRotationPoint(-14.5F, 4F, -0.5F);
		ConnectorFront.setTextureSize(128, 64);
		ConnectorFront.mirror = true;
		setRotation(ConnectorFront, 0F, 0F, 0F);
		ConnectorBFront = new ModelRenderer(this, 8, 18);
		ConnectorBFront.addBox(0F, 0F, -1F, 1, 4, 1);
		ConnectorBFront.setRotationPoint(-14F, 6F, 0.5F);
		ConnectorBFront.setTextureSize(128, 64);
		ConnectorBFront.mirror = true;
		setRotation(ConnectorBFront, -0.7853982F, 0F, 0F);
		ConnectorBBack = new ModelRenderer(this, 12, 18);
		ConnectorBBack.addBox(0F, 0F, -1F, 1, 4, 1);
		ConnectorBBack.setRotationPoint(-3F, 6F, 0.5F);
		ConnectorBBack.setTextureSize(128, 64);
		ConnectorBBack.mirror = true;
		setRotation(ConnectorBBack, -0.7853982F, 0F, 0F);
		Connector = new ModelRenderer(this, 18, 26);
		Connector.addBox(0F, 3.5F, -1.5F, 12, 2, 2);
		Connector.setRotationPoint(-14F, 6F, 0.5F);
		Connector.setTextureSize(128, 64);
		Connector.mirror = true;
		setRotation(Connector, -0.7853982F, 0F, 0F);
		ConnectorStrut = new ModelRenderer(this, 18, 24);
		ConnectorStrut.addBox(0F, 2F, -1F, 10, 1, 1);
		ConnectorStrut.setRotationPoint(-13F, 6F, 0.5F);
		ConnectorStrut.setTextureSize(128, 64);
		ConnectorStrut.mirror = true;
		setRotation(ConnectorStrut, -0.7853982F, 0F, 0F);
		PipeLarge = new ModelRenderer(this, 46, 30);
		PipeLarge.addBox(0F, 0F, 0F, 8, 2, 2);
		PipeLarge.setRotationPoint(-9.5F, 7F, -1F);
		PipeLarge.setTextureSize(128, 64);
		PipeLarge.mirror = true;
		setRotation(PipeLarge, 0F, 0F, 0F);
		PipeLargeBack = new ModelRenderer(this, 46, 22);
		PipeLargeBack.addBox(0F, 0F, 0F, 2, 7, 1);
		PipeLargeBack.setRotationPoint(-4F, 2F, 2F);
		PipeLargeBack.setTextureSize(128, 64);
		PipeLargeBack.mirror = true;
		setRotation(PipeLargeBack, 0F, 0F, 0F);
		PipiLargeConnector = new ModelRenderer(this, 40, 23);
		PipiLargeConnector.addBox(0F, 0F, 0F, 2, 2, 1);
		PipiLargeConnector.setRotationPoint(-4F, 7F, 1F);
		PipiLargeConnector.setTextureSize(128, 64);
		PipiLargeConnector.mirror = true;
		setRotation(PipiLargeConnector, 0F, 0F, 0F);
		PlateFront = new ModelRenderer(this, 20, 15);
		PlateFront.addBox(0F, 0F, 0F, 1, 4, 5);
		PlateFront.setRotationPoint(-13F, 1.5F, -2.5F);
		PlateFront.setTextureSize(128, 64);
		PlateFront.mirror = true;
		setRotation(PlateFront, 0F, 0F, 0.6108652F);
		ScaffoldFront = new ModelRenderer(this, 0, 13);
		ScaffoldFront.addBox(0F, 0F, 0F, 1, 1, 3);
		ScaffoldFront.setRotationPoint(-13F, 7F, -0.5F);
		ScaffoldFront.setTextureSize(128, 64);
		ScaffoldFront.mirror = true;
		setRotation(ScaffoldFront, 0F, 0F, 0F);
		ScaffoldBottom = new ModelRenderer(this, 0, 11);
		ScaffoldBottom.addBox(0F, 0F, 0F, 8, 1, 1);
		ScaffoldBottom.setRotationPoint(-12F, 7F, 1.5F);
		ScaffoldBottom.setTextureSize(128, 64);
		ScaffoldBottom.mirror = true;
		setRotation(ScaffoldBottom, 0F, 0F, 0F);
		ScaffoldBack = new ModelRenderer(this, 32, 18);
		ScaffoldBack.addBox(0F, 0F, 0F, 1, 5, 1);
		ScaffoldBack.setRotationPoint(-5F, 2.5F, 1.5F);
		ScaffoldBack.setTextureSize(128, 64);
		ScaffoldBack.mirror = true;
		setRotation(ScaffoldBack, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		Barrel1.render(f5);
		Barrel2.render(f5);
		BarrelBack.render(f5);
		GL11.glDisable(GL11.GL_CULL_FACE);
		BarrelNozzle.render(f5);
		GL11.glEnable(GL11.GL_CULL_FACE);
		TankF1.render(f5);
		TankF2.render(f5);
		TankF3.render(f5);
		TankB1.render(f5);
		TankB2.render(f5);
		TankB3.render(f5);
		Drum1.render(f5);
		Drum2.render(f5);
		BodyBACK.render(f5);
		GL11.glDisable(GL11.GL_CULL_FACE);
		PipeLPlate.render(f5);
		GL11.glEnable(GL11.GL_CULL_FACE);
		BodyBottom.render(f5);
		Handle.render(f5);
		Trigger.render(f5);
		CoolingBlock.render(f5);
		BodyCenter.render(f5);
		GL11.glDisable(GL11.GL_CULL_FACE);
		PipeRPlate.render(f5);
		GL11.glEnable(GL11.GL_CULL_FACE);
		StockTop.render(f5);
		StockFront.render(f5);
		StockBack.render(f5);
		StockBottom.render(f5);
		GL11.glDisable(GL11.GL_CULL_FACE);
		PipeLPlateB.render(f5);
		PipeRPlateB.render(f5);
		GL11.glEnable(GL11.GL_CULL_FACE);
		StockConnector.render(f5);
		PipeTL.render(f5);
		PipeBL.render(f5);
		PipeTR.render(f5);
		PipeBR.render(f5);
		PipeL.render(f5);
		PipiR.render(f5);
		ConnectorFront.render(f5);
		ConnectorBFront.render(f5);
		ConnectorBBack.render(f5);
		Connector.render(f5);
		ConnectorStrut.render(f5);
		PipeLarge.render(f5);
		PipeLargeBack.render(f5);
		PipiLargeConnector.render(f5);
		PlateFront.render(f5);
		ScaffoldFront.render(f5);
		ScaffoldBottom.render(f5);
		ScaffoldBack.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
