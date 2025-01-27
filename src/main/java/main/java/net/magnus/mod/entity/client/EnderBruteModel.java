package main.java.net.magnus.mod.entity.client;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.entity.custom.EnderBruteEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class EnderBruteModel<T extends EnderBruteEntity> extends SinglePartEntityModel<T>{
    public static final EntityModelLayer ENDER_BRUTE = new EntityModelLayer(Identifier.of(Mod.MOD_ID, "ender_brute"), "main");

        private final ModelPart EnderBrute;
        private final ModelPart Head;

        public EnderBruteModel(ModelPart root) {
            this.EnderBrute = root.getChild("EnderBrute");
            this.Head = this.EnderBrute.getChild("Head");
        }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData EnderBrute = modelPartData.addChild("EnderBrute", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData LeftLeg = EnderBrute.addChild("LeftLeg", ModelPartBuilder.create().uv(54, -1).mirrored().cuboid(-1.0F, 0.0F, -2.0F, 3.0F, 26.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(2.0F, -26.0F, 0.0F));

        ModelPartData RightLeg = EnderBrute.addChild("RightLeg", ModelPartBuilder.create().uv(54, -1).cuboid(-2.0F, 0.0F, -2.0F, 3.0F, 26.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -26.0F, 0.0F));

        ModelPartData LeftArm = EnderBrute.addChild("LeftArm", ModelPartBuilder.create().uv(52, -2).mirrored().cuboid(-1.0F, -10.0F, -2.0F, 4.0F, 30.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, -28.0F, 0.0F));

        ModelPartData RightArm = EnderBrute.addChild("RightArm", ModelPartBuilder.create().uv(52, -2).cuboid(-5.0F, -6.0F, -1.0F, 4.0F, 30.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -32.0F, 0.0F));

        ModelPartData Body = EnderBrute.addChild("Body", ModelPartBuilder.create().uv(32, 16).cuboid(-4.0F, -4.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -34.0F, 0.0F));

        ModelPartData Head = EnderBrute.addChild("Head", ModelPartBuilder.create().uv(-4, -2).cuboid(-6.0F, -30.0F, -4.0F, 10.0F, 10.0F, 10.0F, new Dilation(-0.5F)), ModelTransform.pivot(1.0F, -12.0F, -5.0F));
        return TexturedModelData.of(modelData, 64, 32);
    }
        @Override
        public void setAngles(EnderBruteEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.getPart().traverse().forEach(ModelPart::resetTransform);
            this.setHeadAngles(netHeadYaw, headPitch);

            this.animateMovement(EnderBruteAnimations.ANIM_ENDER_BRUTE_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
            this.updateAnimation(entity.idleAnimationState, EnderBruteAnimations.ANIM_ENDER_BRUTE_IDLE, ageInTicks, 1f);
        }

        private void setHeadAngles(float headYaw, float headPitch) {
            headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
            headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

            this.Head.yaw = headYaw * 0.017453292F;
            this.Head.pitch = headPitch * 0.017453292F;
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
            EnderBrute.render(matrices, vertexConsumer, light, overlay, color);
        }

    @Override
    public ModelPart getPart() {
        return EnderBrute;
    }
}