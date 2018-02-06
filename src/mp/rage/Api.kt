@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "FINAL_SUPERTYPE")

package mp.rage

external interface mp {
    companion object {
        val blips: MpBlipPool
        val browsers: MpBrowserPool
        val cameras: MpCameraPool
        val checkpoints: MpCheckpointPool
        val colshapes: MpColshapePool
        val discord: MpDiscord
        val events: MpEventPool
        val game: MpGame
        val gui: MpGui
        val keys: MpKeys
        val labels: MpTextLabelPool
        val markers: MpMarkerPool
        val nametags: MpNametags
        val objects: MpObjectPool
        val peds: MpPedPool
        val pickups: MpPickupPool
        val players: MpPlayerPool
        val raycasting: MpRaycasting
        val storage: MpStorage
        val Vector3: MpVector3
        val vehicles: MpVehiclePool
    }
}

external interface MpBlip : MpEntity {
    fun addTextComponentSubstringName()
    override fun doesExist(): Boolean
    fun endTextCommandSetName()
    override fun getAlpha(): Int
    fun getColour(): Int
    fun getCoords(): MpVector3
    fun getFirstInfoId(): MpBlip
    fun getHudColour(): Int
    fun getInfoIdDisplay(): Int
    fun getInfoIdEntityIndex(): Int
    fun getInfoIdPickupIndex()//: MpPickup
    fun getInfoIdType(): Int
    fun getNextInfoId(): MpBlip
    fun getSprite(): Int
    fun hideNumberOn()
    fun isFlashing(): Boolean
    fun isMissionCreator(): Boolean
    fun isOnMinimap(): Boolean
    fun isShortRange(): Boolean
    fun pulse()
    fun setAlpha(alpha: Int)
    fun setAlpha(alphaLevel: String, skin: Boolean)
    fun setAsFriendly(toggle: Boolean)
    fun setAsMissionCreator(toggle: Boolean)
    fun setAsShortRange(toggle: Boolean)
    fun setBright(toggle: Boolean)
    fun setCategory(index: Int)
    fun setColour(color: Int)
    fun setCoords(posX: Number, posY: Number, posZ: Number)
    fun setDisplay(displayId: Int)
    fun setFade(opacity: Int, duration: Int)
    fun setFlashes(toggle: Boolean)
    fun setFlashesAlternate(toggle: Boolean)
    fun setFlashInterval(p1: Any)
    fun setFlashTimer(duration: Int)
    fun setHighDetail(toggle: Boolean)
    fun setNameFromTextFile(gxtEntry: String)
    fun setNameToPlayerName(player: MpPlayer)
    fun setPriority(priority: Int)
    fun setRotation(rotation: Int)
    fun setRoute(enabled: Boolean)
    fun setRouteColour(colour: Int)
    fun setScale(scale: Number)
    fun setSecondaryColour(r: Number, g: Number, b: Number)
    fun setShowCone(toggle: Boolean)
    fun setShowHeadingIndicator(toggle: Boolean)
    fun setSprite(spriteId: Int)
    fun showNumberOn(number: Int)
}

external interface MpBrowser {
    var active: Boolean
    var url: String

    fun destroy()
    fun execute(code: String)
    fun markAsChat()
    fun reload(ignoreCache: Boolean)
}

external interface MpCamera {
    fun animatedShake(p0: String, p1: String, p2: String, p3: Number)
    fun attachTo(entity: MpEntity, boneIndex: Int, xPos: Number, yPos: Number, zPos: Number, xRot: Number, yRot: Number, zRot: Number, p8: Boolean, useSoftPinning: Boolean, collision: Boolean, isPed: Boolean, vertexIndex: Int, fixedRot: Boolean)
    fun attachTo(entity: MpEntity, xOffset: Number, yOffset: Number, zOffset: Number, isRelative: Boolean)
    fun attachToPedBone(ped: MpPed, boneIndex: Int, x: Number, y: Number, z: Number, heading: Boolean)
    fun destroy(destroy: Boolean)
    fun detach()
    fun doesExist(): Boolean
    fun getAnimCurrentPhase(): Number
    fun getCoord(): MpVector3
    fun getDirection(): MpVector3
    fun getFarClip(): Number
    fun getFarDof(): Number
    fun getFov(): Number
    fun getNearClip(): Number
    fun getRot(p0: Number): MpVector3
    fun getSplinePhase(): Number
    fun isActive(): Boolean
    fun isInterpolating(): Boolean
    fun isPlayingAnim(animName: String, animDictionary: String): Boolean
    fun isRendering(): Boolean
    fun isShaking(): Boolean
    fun playAnim(animName: String, animDictionary: String, x: Number, y: Number, z: Number, xRot: Number, yRot: Number, zRot: Number, p8: Boolean, p9: Int)
    fun playAnim(animName: String, propName: String, p2: Number, p3: Boolean, p4: Boolean, p5: Boolean, delta: Number, bitset: Any): Boolean
    fun pointAt(entity: MpEntity, offsetX: Number, offsetY: Number, offsetZ: Number, p4: Boolean)
    fun pointAtCoord(x: Number, y: Number, z: Number)
    fun pointAtPedBone(ped: MpPed, boneIndex: Int, x: Number, y: Number, z: Number, heading: Boolean)
    fun setActive(active: Boolean)
    fun setActiveWithInterp(camFrom: MpCamera, duration: Int, easeLocation: Int, easeRotation: Int)
    fun setAffectsAiming(toggle: Boolean)
    fun setAnimCurrentPhase(phase: Number)
    fun setCoord(posX: Number, posY: Number, posZ: Number)
    fun setDebugName(name: String)
    fun setDofFnumberOfLens(p1: Number)
    fun setDofFocusDistanceBias(p0: Number)
    fun setDofMaxNearInFocusDistance(p0: Number)
    fun setDofMaxNearInFocuxDistanceBlendLevel(p0: Number)
    fun setDofPlanes(p0: Number, p1: Number, p2: Number, p3: Number)
    fun setDofStrength(dofStrength: Number)
    fun setFarClip(farClip: Number)
    fun setFarDof(farDof: Number)
    fun setFov(fieldOfView: Number)
    fun setInheritRollVehicle(p1: Boolean)
    fun setMotionBlurStrength(strength: Number)
    fun setNearClip(nearClip: Number)
    fun setNearDof(nearDof: Number)
    fun setParams(x: Number, y: Number, z: Number, xRot: Number, yRot: Number, zRot: Number, fov: Number, duration: Number, p8: Number, p9: Number, p10: Number)
    fun setRot(rotX: Number, rotY: Number, rotZ: Number, p3: Int)
    fun setShakeAmplitude(amplitude: Number)
    fun setUseShallowDofMode(toggle: Boolean)
    fun shake(type: String, amplitude: Number)
    fun stopPointing()
    fun stopShaking(p0: Boolean)
}

external interface MpCheckpoint : MpEntity {
    // Todo: Checkpoint
}

external interface MpColshape : MpEntity {
    // Todo: Colshape
}

external interface MpDiscord {
    fun update(status: String, state: String)
}

external interface MpEntity {
    var alpha: Int
    var dimension: Int
    var model: Int
    var position: MpVector3

    fun applyForceTo(forceType: ForceType, x: Number, y: Number, z: Number, xRot: Number, yRot: Number, zRot: Number, boneIndex: Number, isRel: Number, p9: Boolean, highForce: Boolean, p11: Boolean, p12: Boolean)
    fun applyForceToCenterOfMass(forceType: ForceType, x: Number, y: Number, z: Number, p4: Boolean, isRel: Boolean, highForce: Boolean, p7: Boolean)
    fun attachTo(entity: MpEntity, boneIndex: Int, xPos: Number, yPos: Number, zPos: Number, xRot: Number, yRot: Number, zRot: Number, p8: Boolean, useSoftPinning: Boolean, collision: Boolean, isPed: Boolean, vertexIndex: Int, fixedRot: Boolean)
    fun attachToPhysically(entity: MpEntity, boneIndex1: Int, boneIndex2: Int, xPos1: Number, yPos1: Number, zPos1: Number, xPos2: Number, yPos2: Number, zPos2: Number, xRot: Number, yRot: Number, zRot: Number, breakForce: Number, fixedRot: Boolean, p14: Boolean, collision: Boolean, p16: Boolean, p17: Int)
    fun clearLastDamage()
    fun destroy()
    fun detach(p0: Boolean, collision: Boolean)
    fun dist(position: MpVector3): Number
    fun distSquared(position: MpVector3): Number
    fun doesBelongToThisScript(p0: Boolean): Boolean
    fun doesExist(): Boolean
    fun doesHaveDrawable(): Boolean
    fun doesHavePhysics(): Boolean
    fun forceAiAndAnimationUpdate()
    fun freezePosition(toggle: Boolean)
    fun getAlpha(): Int
    fun getAnimCurrentTime(animDict: String, animName: String): Number
    fun getAnimTotalTime(animDict: String, animName: String): Number
    fun getAttachedTo(): MpEntity
    fun getBoneIndexByName(boneName: String): Int
    fun getCollisionNormalOfLastHitFor(): MpVector3
    fun getCoords(alive: Boolean): MpVector3
    fun getForwardVector(): MpVector3
    fun getForwardX(): Number
    fun getForwardY(): Number
    fun getHeading(): Int
    fun getHealth(): Int
    fun getHeight(x: Number, y: Number, z: Number, atTop: Boolean, inWorldCoords: Boolean): Number
    fun getHeightAboveGround(): Number
    fun getLastMaterialHitBy(): Number
    fun getLodDist(): Int
    fun getMatrix(rightVector: MpVector3, forwardVector: MpVector3, upVector: MpVector3, position: MpVector3)//: `T$0`
    fun getMaxHealth(): Int
    fun getModel(): Int
    fun getNearestPlayerTo(): MpPlayer
    fun getNearestPlayerToOnTeam(team: Int): MpPlayer
    fun getObjectIndexFromIndex(): Number
    fun getOffsetFromGivenWorldCoords(posX: Number, posY: Number, posZ: Number): MpVector3
    fun getOffsetFromInWorldCoords(offsetX: Number, offsetY: Number, offsetZ: Number): MpVector3
    fun getPedIndexFromIndex(): Int
    fun getPhysicsHeading(): Number
    fun getPitch(): Number
    fun getPopulationType(): Int
    fun getQuaternion(x: Number, y: Number, z: Number, w: Number): MpQuaternion
    fun getRoll(): Number
    fun getRotation(rotationOrder: Int): MpVector3
    fun getRotationVelocity(): MpVector3
    fun getScript(script: Int): Int
    fun getSpeed(): Number
    fun getSpeedVector(relative: Boolean): MpVector3
    fun getSubmergedLevel(): Number
    fun getType(): Int
    fun getUprightValue(): Int
    fun getVariable(value: String): Any
    fun getVehicleIndexFromIndex(): MpVehicle
    fun getVelocity(): MpVector3
    fun getWorldPositionOfBone(boneIndex: Int): MpVector3
    fun hasAnimEventFired(actionHash: Int): Boolean
    fun hasAnimFinished(animDict: String, animName: String, p2: Int): Boolean
    fun hasBeenDamagedBy(entity: MpEntity, p1: Boolean): Boolean
    fun hasBeenDamagedByAnyObject(): Boolean
    fun hasBeenDamagedByAnyPed(): Boolean
    fun hasBeenDamagedByAnyVehicle(): Boolean
    fun hasClearLosTo(entity: MpEntity, traceType: Int): Boolean
    fun hasClearLosToInFront(entity: MpEntity): Boolean
    fun hasCollidedWithAnything(): Boolean
    fun hasCollisionLoadedAround(): Boolean
    fun isAMission(): Boolean
    fun isAnObject(): Boolean
    fun isAPed(): Boolean
    fun isAt(entity: MpEntity, xSize: Number, ySize: Number, zSize: Number, p4: Boolean, p5: Boolean, p6: Int): Boolean
    fun isAtCoord(xPos: Number, yPos: Number, zPos: Number, xSize: Number, ySize: Number, zSize: Number, p6: Boolean, p7: Boolean, p8: Int): Boolean
    fun isAttached(): Boolean
    fun isAttachedTo(to: Int): Boolean
    fun isAttachedToAnyObject(): Boolean
    fun isAttachedToAnyPed(): Boolean
    fun isAttachedToAnyVehicle(): Boolean
    fun isAVehicle(): Boolean
    fun isCollisonDisabled(): Boolean
    fun isDead(): Boolean
    fun isInAir(): Boolean
    fun isInAngledArea(originX: Number, originY: Number, originZ: Number, edgeX: Number, edgeY: Number, edgeZ: Number, angle: Number, p7: Boolean, p8: Boolean, p9: Any): Boolean
    fun isInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, p6: Boolean, p7: Boolean, p8: Any): Boolean
    fun isInWater(): Boolean
    fun isInZone(zone: String): Boolean
    fun isOccluded(): Boolean
    fun isOnScreen(): Boolean
    fun isPlayingAnim(animDict: String, animName: String, p2: Int): Boolean
    fun isStatic(): Boolean
    fun isTouching(targetEntity: MpEntity): Boolean
    fun isTouchingModel(modelHash: Int): Boolean
    fun isUpright(angle: Number): Boolean
    fun isUpsidedown(): Boolean
    fun isVisible(): Boolean
    fun isVisibleToScript(): Boolean
    fun isWaitingForWorldCollision(): Boolean
    fun playAnim(animName: String, propName: String, p2: Number, p3: Boolean, p4: Boolean, p5: Boolean, delta: Number, bitset: Any): Boolean
    fun playSynchronizedAnim(syncedScene: Int, animation: String, propName: String, p3: Number, p4: Number, p5: Any, p6: Number): Boolean
    fun processAttachments()
    fun resetAlpha()
    fun setAlpha(alphaLevel: Int, skin: Boolean)
    fun setAlwaysPrerender(toggle: Boolean)
    fun setAnimCurrentTime(animDict: String, animName: String, time: Number)
    fun setAnimSpeed(animDict: String, animName: String, speedMultiplier: Number)
    fun setAsMission(p0: Boolean, byThisScript: Boolean)
    fun setCanBeDamaged(toggle: Boolean)
    fun setCanBeDamagedByRelationshipGroup(p0: Boolean, p1: Any)
    fun setCanBeTargetedWithoutLos(toggle: Boolean)
    fun setCollision(toggle: Boolean, keepPhysics: Boolean)
    fun setCoords(xPos: Number, yPos: Number, zPos: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean, clearArea: Boolean)
    fun setCoords2(xPos: Number, yPos: Number, zPos: Number, xAxis: Number, yAxis: Number, zAxis: Number, clearArea: Boolean)
    fun setCoordsNoOffset(xPos: Number, yPos: Number, zPos: Number, xAxis: Number, yAxis: Number, zAxis: Number)
    fun setDynamic(toggle: Boolean)
    fun setHasGravity(toggle: Boolean)
    fun setHeading(heading: Number)
    fun setHealth(health: Int)
    fun setInvincible(toggle: Boolean)
    fun setIsTargetPriority(p0: Boolean, p1: Int)
    fun setLights(toggle: Boolean)
    fun setLoadCollisionFlag(toggle: Boolean)
    fun setLodDist(value: Int)
    fun setMaxHealth(value: Int)
    fun setMaxSpeed(speed: Number)
    fun setMotionBlur(toggle: Boolean)
    fun setNoCollision(entity: MpEntity, collision: Boolean)
    fun setOnlyDamagedByPlayer(toggle: Boolean)
    fun setOnlyDamagedByRelationshipGroup(p0: Boolean, p1: Any)
    fun setProofs(bulletProof: Boolean, fireProof: Boolean, explosionProof: Boolean, collisionProof: Boolean, meleeProof: Boolean, p5: Boolean, p6: Boolean, drownProof: Boolean)
    fun setQuaternion(x: Number, y: Number, z: Number, w: Number)
    fun setRecordsCollisions(toggle: Boolean)
    fun setRenderScorched(toggle: Boolean)
    fun setRotation(pitch: Number, roll: Number, yaw: Number, rotationOrder: Int, p4: Boolean)
    fun setTrafficlightOverride(state: Int)
    fun setVariable(key: String, value: Any): Any
    fun setVelocity(x: Number, y: Number, z: Number)
    fun setVisible(toggle: Boolean, p1: Boolean)
    fun stopAnim(animation: String, animGroup: String, p2: Int)
    fun stopSynchronizedAnim(p0: Int, p1: Boolean): Boolean
}

external interface MpGui {
    var chat: MpGuiChat
    var cursor: MpGuiCursor

    fun execute(code: String)
}

external interface MpGuiChat {
    var colors: Boolean
    var safe: Boolean

    fun activate(state: Boolean)
    fun push(message: String)
    fun show(state: Boolean)
}

external interface MpGuiCursor {
    var position: Boolean
    var visible: Boolean

    fun show(state: Boolean, freezeControls: Boolean)
}

external interface MpKeys {
    fun bind(keyCode: Int, keyHold: Int, handler: Function<*>)
    fun isUp(keyCode: Int): Boolean
    fun isDown(keyCode: Int): Boolean
    fun unbind(keyCode: Number, handler: Function<*>)
}

external interface MpMarker {
    // Todo: Marker
}

external interface MpNametags {
    var enabled: Boolean
    fun set(vararg value: Any)
    fun update(vararg value: Any)
}

external interface MpObject : MpEntity {
    fun hasBeenBroken(): Boolean
    override fun isVisible(): Boolean
    fun markForDeletion(): Boolean
    fun placeOnGroundProperly(): Boolean
    fun setActivatePhysicsAsSoonAsItIsUnfrozen(toggle: Boolean)
    fun setPhysicsParams(weight: Number, p1: Number, p2: Number, p3: Number, p4: Number, gravity: Number, p6: Number, p7: Number, p8: Number, p9: Number, buoyancy: Number)
    fun setTargettable(targettable: Boolean)
    fun slide(toX: Number, toY: Number, toZ: Number, speedX: Number, speedY: Number, speedZ: Number, collision: Boolean)
}

external interface MpPed : MpEntity {
    // Todo: Ped
}

external interface MpPickup : MpEntity {
    // Todo: Pickup
}

external interface MpPlayer : MpEntity {
    var armour: Int
    var eyeColour: Int
    var hairColour: Int
    var hairHighlightColour: Int
    var heading: Int
    var health: Int
    var name: String
    var weapon: Int

    val action: String
    val aimTarget: Boolean
    val ip: String
    val isAiming: Boolean
    val isClimbing: Boolean
    val isEnteringVehicle: Boolean
    val isInCover: Boolean
    val isJumping: Boolean
    val isLeavingVehicle: Boolean
    val ping: Int
    val seat: Boolean
    val vehicle: Boolean

    // Todo: Change all Numbers

    fun addVehicleSubtaskAttack(ped2: Number)
    fun addVehicleSubtaskAttackCoord(x: Number, y: Number, z: Number)
    fun applyBlood(boneIndex: Number, xRot: Number, yRot: Number, zRot: Number, woundType: String)
    fun applyBloodByZone(p1: Any, p2: Number, p3: Number, p4: Any)
    fun applyBloodDamageByZone(p1: Any, p2: Number, p3: Number, p4: Any)
    fun applyBloodSpecific(p1: Any, p2: Number, p3: Number, p4: Number, p5: Number, p6: Any, p7: Number, p8: Any)
    fun applyDamageDecal(p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Boolean, p9: String)
    fun applyDamagePack(damagePack: String, damage: Number, mult: Number)
    fun applyDamageTo(damageAmount: Number, p2: Boolean)
    fun canInCombatSeeTarget(target: Number): Boolean
    fun canKnockOffVehicle(): Boolean
    fun canPedHear(ped: Number): Boolean
    fun canRagdoll(): Boolean
    fun changePed(ped: Number, b2: Boolean, b3: Boolean)
    fun clearAllProps()
    fun clearAlternateMovementAnim(stance: Number, p2: Number)
    fun clearBloodDamage()
    fun clearBloodDamageByZone(p1: Number)
    fun clearDamageDecalByZone(p1: Number, p2: String)
    fun clearDecorations()
    fun clearDriveByClipsetOverride()
    fun clearDrivebyTaskUnderneathDrivingTask()
    fun clearFacialDecorations()
    fun clearFacialIdleAnimOverride()
    fun clearHasDamagedAtLeastOneNonAnimalPed()
    fun clearHasDamagedAtLeastOnePed()
    fun clearLastDamageBone()
    fun clearParachuteModelOverride()
    fun clearParachutePackModelOverride()
    fun clearParachuteVariationOverride()
    fun clearProp(propId: Number)
    fun clearSecondaryTask()
    fun clearTasks()
    fun clearTasksImmediately()
    fun clearWantedLevel()
    fun clearWetness()
    fun clone(heading: Number, networkHandle: Boolean, pedHandle: Boolean): Number
    fun cloneToTarget(ped2: Number)
    fun controlMountedWeapon(): Boolean
    fun explodeHead(weaponHash: Number)
    fun forceMotionState(motionStateHash: Number, p2: Boolean, p3: Boolean, p4: Boolean): Boolean
    fun forceToOpenParachute()
    fun getAccuracy(): Number
    fun getAlertness(): Number
    fun getAmmoInClip(weapon: Number): Number
    fun getArmour(): Number
    fun getBoneCoords(boneId: Number, offsetX: Number, offsetY: Number, offsetZ: Number): MpVector3
    fun getBoneIndex(boneId: Number): Number
    fun getCauseOfDeath(): Number
    fun getCombatNumber(ped: Number, p1: Number): Number
    fun getCombatMovement(): Number
    fun getCombatRange(): Number
    fun getConfigFlag(flagId: Number, p2: Boolean): Boolean
    fun getCurrentStealthNoise(): Number
    fun getDeadPickupCoords(p1: Number, p2: Number): MpVector3
    fun getDecorationsState(): Number
    fun getDefensiveAreaPosition(p1: Boolean): MpVector3
    fun getDesiredMoveBlendRatio(): Number
    fun getDrawableVariation(componentId: Number): Number
    fun getEnveffScale(): Number
    fun getExtractedDisplacement(worldSpace: Boolean): MpVector3
    fun getFloodInvincibility(p1: Boolean)
    fun getGroup(): Number
    fun getGroupIndex(): Number
    fun getHasReserveParachute(): Boolean
    fun getHeadBlendData(headBlendData: MpHeadBlend)
    fun getHeadOverlayValue(overlayId: Number): Number
    fun getInvincible(): Boolean
    fun getIsTaskActive(taskNumber: Number): Boolean
    fun getJackTarget(): Number
    fun getLastDamageBone(outBone: Number): Number
    fun getMaxArmour(): Number
    override fun getMaxHealth(): Number
    fun getMeleeTargetFor(): Number
    fun getMoney(): Number
    fun getMount(): Number
    fun getName(): String
    fun getNavmeshRouteDistanceRemaining(p1: Any, p2: Any): Any
    fun getNearbyPeds(sizeAndPeds: Number, ignore: Number): Number
    fun getNearbyVehicles(sizeAndVehs: Number): Number
    fun getNumberOfDrawableVariations(componentId: Number)
    fun getNumberOfPropDrawableVariations(propId: Number): Number
    fun getNumberOfPropTextureVariations(propId: Number, drawableId: Number): Number
    fun getNumberOfTextureVariations(componentId: Number, drawableId: Number): Number
    fun getPaletteVariation(componentId: Number): Number
    fun getParachuteLandingType(): Number
    fun getParachutePackTintIndex(tintIndex: Number): Number
    fun getParachuteSmokeTrailColor(r: Number, g: Number, b: Number): MpRgb
    fun getParachuteState(): Number
    fun getParachuteTintIndex(tintIndex: Number): Number
    fun getPed(): Number
    fun getPedScriptIndex(): Number
    fun getPhoneGestureAnimCurrentTime(): Number
    fun getPhoneGestureAnimTotalTime(): Number
    fun getPlayerIsFollowing(): Number
    fun getPropIndex(componentId: Number): Number
    fun getPropTextureIndex(componentId: Number): Number
    fun getRagdollBoneIndex(bone: Number): Number
    fun getRelationshipBetweens(ped2: Number)
    fun getRelationshipGroupDefaultHash(): Number
    fun getRelationshipGroupHash(): Number
    fun getReserveParachuteTintIndex(tintIndex: Number): Number
    fun getResetFlag(flagId: Number): Boolean
    fun getRgbColour(r: Number, g: Number, b: Number): MpRgb
    fun getScriptTaskStatus(taskHash: Number): Number
    fun getSeatIsTryingToEnter(): Number
    fun getSequenceProgress(): Number
    fun getsJacker(): Number
    fun getSourceOfDeath(): Number
    fun getSprintStaminaRemaining(): Number
    fun getSprintTimeRemaining(): Number
    fun getTeam(): Number
    fun getTextureVariation(componentId: Number): Number
    fun getTimeOfDeath(): Number
    override fun getType(): Number
    fun getUnderwaterTimeRemaining(): Number
    fun getVehicleIsIn(getLastVehicle: Boolean): Number
    fun getVehicleIsTryingToEnter(): Number
    fun getVehicleIsUsing(): Number
    fun getWantedCentrePosition(): MpVector3
    fun getWantedLevel(): Number
    fun giveHelmet(cannotRemove: Boolean, helmetFlag: Number, textureIndex: Number)
    fun giveNmMessage()
    fun giveRagdollControl(toggle: Boolean)
    fun giveWeapon(weapon: Number, ammo: Number, equipNow: Boolean)
    fun hasBeenSpottedInStolenVehicle(): Boolean
    fun hasDamagedAtLeastOneNonAnimalPed(): Boolean
    fun hasDamagedAtLeastOnePed(): Boolean
    fun hasHeadBlendFinished(): Boolean
    fun hasLeftTheWorld(): Boolean
    fun hasTeleportFinished(): Boolean
    fun hasUseScenarioTask(): Boolean
    fun hideBloodDamageByZone(p1: Any, p2: Boolean)
    fun isActiveInScenario(): Boolean
    fun isAimingFromCover(): Boolean
    fun isBeingArrested(atArresting: Boolean): Boolean
    fun isBeingJacked(): Boolean
    fun isBeingStealthKilled(): Boolean
    fun isBeingStunned(p1: Number): Boolean
    fun isComponentVariationValid(componentId: Number, drawableId: Number, textureId: Number): Boolean
    fun isControlOn(): Boolean
    fun isConversationDead(): Boolean
    fun isCuffed(): Boolean
    override fun isDead(): Boolean
    fun isDeadOrDying(p1: Boolean): Boolean
    fun isDiving(): Boolean
    fun isDoingDriveby(): Boolean
    fun isDrivebyTaskUnderneathDrivingTask(): Boolean
    fun isDucking(): Boolean
    fun isEvasiveDiving(evadingEntity: Number): Boolean
    fun isFacingPed(otherPed: Number, angle: Number): Boolean
    fun isFalling(): Boolean
    fun isFatallyInjured(): Boolean
    fun isFleeing(): Boolean
    fun isFreeAiming(): Boolean
    fun isFreeForAmbientTask(): Boolean
    fun isGettingIntoAVehicle(): Boolean
    fun isGettingUp(): Boolean
    fun isGoingIntoCover(): Boolean
    fun isGroupMember(groupId: Int): Boolean
    fun isHangingOnToVehicle(): Boolean
    fun isHeadtracking(entity: Number): Boolean
    fun isHeadtrackingPed(ped2: Number): Boolean
    fun isHuman(): Boolean
    fun isHurt(): Boolean
    fun isInAnyBoat(): Boolean
    fun isInAnyHeli(): Boolean
    fun isInAnyPlane(): Boolean
    fun isInAnyPoliceVehicle(): Boolean
    fun isInAnySub(): Boolean
    fun isInAnyTaxi(): Boolean
    fun isInAnyTrain(): Boolean
    fun isInAnyVehicle(atGetIn: Boolean): Boolean
    fun isInCombat(target: Number): Boolean
    fun isInCoverFacingLeft(): Boolean
    fun isInFlyingVehicle(): Boolean
    fun isInGroup(): Boolean
    fun isInjured(): Boolean
    fun isInMeleeCombat(): Boolean
    fun isInModel(modelHash: Int): Boolean
    fun isInParachuteFreeFall(): Boolean
    fun isInVehicle(vehicle: Number, atGetIn: Boolean): Boolean
    fun isInWrithe(): Boolean
    fun isJacking(): Boolean
    fun isJumpingOutOfVehicle(): Boolean
    fun isMale(): Boolean
    fun isModel(modelHash: Int): Boolean
    fun isMountedWeaponTaskUnderneathDrivingTask(): Boolean
    fun isMoveBlendRatioRunning(): Boolean
    fun isMoveBlendRatioSprinting(): Boolean
    fun isMoveBlendRatioStill(): Boolean
    fun isMoveBlendRatioWalking(): Boolean
    fun isOnAnyBike(): Boolean
    fun isOnFoot(): Boolean
    fun isOnMount(): Boolean
    fun isOnSpecificVehicle(vehicle: Number): Boolean
    fun isOnVehicle(): Boolean
    fun isPerformingStealthKill(): Boolean
    fun isPlantingBomb(): Boolean
    fun isPlaying(): Boolean
    fun isPlayingPhoneGestureAnim(): Boolean
    fun isPressingHorn(): Boolean
    fun isProne(): Boolean
    fun isPropValid(componentId: Number, drawableId: Number, TextureId: Number): Boolean
    fun isRagdoll(): Boolean
    fun isReadyForCutscene(): Boolean
    fun isReloading(): Boolean
    fun isRidingTrain(): Boolean
    fun isRunning(): Boolean
    fun isRunningArrestTask(): Boolean
    fun isRunningMobilePhoneTask(): Boolean
    fun isRunningRagdollTask(): Boolean
    fun isScriptControlOn(): Boolean
    fun isScriptedScenarioUsingConditionalAnim(animDict: String, anim: String): Boolean
    fun isShooting(): Boolean
    fun isShootingInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, p7: Boolean, p8: Boolean): Boolean
    fun isSittingInAnyVehicle(): Boolean
    fun isSittingInVehicle(vehicle: Number): Boolean
    fun isSprinting(): Boolean
    fun isStill(): Boolean
    fun isStopped(): Boolean
    fun isStrafing(): Boolean
    fun isSwimming(): Boolean
    fun isSwimmingUnderWater(): Boolean
    fun isTargettingAnything(): Boolean
    fun isTracked(): Boolean
    fun isTrackedVisible(): Boolean
    fun isTryingToEnterALockedVehicle(): Boolean
    fun isUsingActionMode(): Boolean
    fun isUsingAnyScenario(): Boolean
    fun isUsingScenario(scenario: String): Boolean
    fun isVaulting(): Boolean
    fun isWalking(): Boolean
    fun isWantedLevelGreater(wantedLevel: Number): Boolean
    fun isWearingHelmet(): Boolean
    fun knockOffProp(p1: Boolean, p2: Boolean, p3: Boolean, p4: Boolean)
    fun knockOffVehicle()
    fun playAnimOnRunningScenario(animDict: String, animName: String)
    fun playFacialAnim(animName: String, animDict: String)
    fun registerHatedTargetsAround(radius: Number)
    fun registerheadshot(): Number
    fun registerTarget(target: Number)
    fun removeDefensiveArea(toggle: Boolean)
    fun removeFromGroup()
    fun removeHelmet(p2: Boolean)
    fun removePreferredCoverSet()
    fun removeWeapon(weapon: Number)
    fun removeAllWeapons()
    fun resetArrestState()
    fun resetInputGait()
    fun resetInVehicleContext()
    fun resetLastVehicle()
    fun resetMovementClipset(p1: Number)
    fun resetRagdollTimer()
    fun resetStamina()
    fun resetStrafeClipset()
    fun resetVisibleDamage()
    fun resetWeaponMovementClipset()
    fun resurrect()
    fun reviveInjured()
    fun setAccuracy(accuracy: Number)
    fun setAlertness(value: Number)
    fun setAllowedToDuck(toggle: Boolean)
    fun setAllowVehiclesOverride(toggle: Boolean)
    fun setAlternateMovementAnim(stance: Number, animDictionary: String, animationName: String, p4: Number, p5: Boolean)
    fun setAmmoInClip(weapon: Number, ammo: Number)
    fun setAngledDefensiveArea(p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Boolean, p9: Boolean)
    fun setArmour(amount: Number)
    fun setAsCop(toggle: Boolean)
    fun setAsEnemy(toggle: Boolean)
    fun setAsGroupLeader(groupId: Int)
    fun setAsGroupMember(groupId: Int)
    fun setBlendFromParents(p1: Any, p2: Any, p3: Number, p4: Number)
    fun setBlockingOfNonTemporaryEvents(toggle: Boolean)
    fun setBoundsOrientation(p1: Number, p2: Number, p3: Number, p4: Number, p5: Number)
    fun setCanArmIk(toggle: Boolean)
    fun setCanAttackFriendly(toggle: Boolean, p2: Boolean)
    fun setCanBeDraggedOut(toggle: Boolean)
    fun setCanBeHassledByGangs(toggle: Boolean)
    fun setCanBeKnockedOffVehicle(state: Number)
    fun setCanBeShotInVehicle(toggle: Boolean)
    fun setCanBeTargetedWhenInjured(toggle: Boolean)
    override fun setCanBeTargetedWithoutLos(toggle: Boolean)
    fun setCanBeTargetted(toggle: Boolean)
    fun setCanBeTargettedByPlayer(player: Number, toggle: Boolean)
    fun setCanBeTargettedByTeam(team: Number, toggle: Boolean)
    fun setCanCowerInCover(toggle: Boolean)
    fun setCanDoDriveBy(toggle: Boolean)
    fun setCanEvasiveDive(toggle: Boolean)
    fun setCanHeadIk(toggle: Boolean)
    fun setCanLeaveParachuteSmokeTrail(enabled: Boolean)
    fun setCanLegIk(toggle: Boolean)
    fun setCanPeekInCover(toggle: Boolean)
    fun setCanPlayAmbientAnims(toggle: Boolean)
    fun setCanPlayAmbientBaseAnims(toggle: Boolean)
    fun setCanPlayGestureAnims(toggle: Boolean)
    fun setCanPlayVisemeAnims(p1: Boolean, p2: Boolean)
    fun setCanRagdoll(toggle: Boolean)
    fun setCanRagdollFromPlayerImpact(toggle: Boolean)
    fun setCanSmashGlass(p1: Boolean, p2: Boolean)
    fun setCanSwitchWeapon(toggle: Boolean)
    fun setCanTeleportToGroupLeader(groupHandle: Int, toggle: Boolean)
    fun setCanTorsoIk(toggle: Boolean)
    fun setCanUseAutoConversationLookat(toggle: Boolean)
    fun setCanUseCover(toggle: Boolean)
    fun setCapsule(value: Number)
    fun setClothPinFrames(toggle: Boolean)
    fun setCombatAbility(p1: Number)
    fun setCombatAttributes(attributeIndex: Number, enabled: Boolean)
    fun setCombatNumber(combatType: Number, p2: Number)
    fun setCombatMovement(combatMovement: Number)
    fun setCombatRange(p1: Number)
    fun setComponentVariation(componentId: Number, drawableId: Number, textureId: Number, paletteId: Number)
    fun setConfigFlag(flagId: Number, value: Boolean)
    fun setControl(toggle: Boolean, possiblyFlags: Number)
    fun setCoordsKeepVehicle(posX: Number, posY: Number, posZ: Number)
    fun setCoordsNoGang(posX: Number, posY: Number, posZ: Number)
    fun setCowerHash(p1: String)
    fun setDecoration(collection: Number, overlay: Number)
    fun setDefaultComponentVariation()
    fun setDefensiveAreaAttachedToPed(attachPed: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Number, p9: Boolean, p10: Boolean)
    fun setDefensiveAreaDirection(p1: Number, p2: Number, p3: Number, p4: Boolean)
    fun setDefensiveSphereAttachedToPed(p1: Any, p2: Number, p3: Number, p4: Number, p5: Number, p6: Boolean)
    fun setDesiredHeading(heading: Number)
    fun setDesiredMoveBlendRatio(p1: Number)
    fun setDiesInSinkingVehicle(toggle: Boolean)
    fun setDiesInstantlyInWater(toggle: Boolean)
    fun setDiesInVehicle(toggle: Boolean)
    fun setDiesInWater(toggle: Boolean)
    fun setDiesWhenInjured(toggle: Boolean)
    fun setDriveByClipsetOverride(clipset: String)
    fun setDriverAbility(ability: Number)
    fun setDriverAggressiveness(aggressiveness: Number)
    fun setDriveTaskCruiseSpeed(cruiseSpeed: Number)
    fun setDriveTaskDrivingStyle(drivingStyle: Number)
    fun setDucking(toggle: Boolean)
    fun setEnableBoundAnkles(toggle: Boolean)
    fun setEnableEnveffScale(toggle: Boolean)
    fun setEnableHandcuffs(toggle: Boolean)
    fun setEnableScuba(toggle: Boolean)
    fun setEnableWeaponBlocking(toggle: Boolean)
    fun setEnveffScale(value: Number)
    fun setEveryoneIgnore(toggle: Boolean)
    fun setExclusivePhoneRelationships(): Number
    fun setEyeColor(index: Number)
    fun setFaceFeature(index: Number, scale: Number)
    fun setFacialDecoration(collection: Number, overlay: Number)
    fun setFacialIdleAnimOverride(animName: String, animDict: String)
    fun setFiringPattern(patternHash: Number)
    fun setFleeAttributes(attributes: Number, p2: Boolean)
    fun setForcedAim(toggle: Boolean)
    fun setForcedZoom(toggle: Boolean)
    fun setForceSkipAimIntro(toggle: Boolean)
    fun setGeneratesDeadBodyEvents(toggle: Boolean)
    fun setGestureGroup(p1: Any)
    fun setGetOutUpsideDownVehicle(toggle: Boolean)
    fun setGravity(toggle: Boolean)
    fun setGroupMemberPassengerIndex(index: Number)
    fun setHairColor(colorId: Int, highlightcolorId: Int)
    fun setHasReserveParachute()
    fun setHeadBlendData(shapeFirstId: Int, shapeSecondId: Int, shapeThirdId: Int, skinFirstId: Int, skinSecondId: Int, skinThirdId: Int, shapeMix: Number, skinMix: Number, thirdMix: Number, isParent: Boolean)
    fun setHeadOverlay(overlayId: Number, index: Number, opacity: Number)
    fun setHeadOverlayColor(overlayId: Number, colorType: Number, colorId: Int, secondColorId: Int)
    fun setHealthRechargeMultiplier(regenRate: Number)
    fun setHearingRange(value: Number)
    fun setHelmet(canWearHelmet: Boolean)
    fun setHelmetFlag(helmetFlag: Number)
    fun setHelmetPropIndex(propIndex: Number)
    fun setHelmetTextureIndex(textureIndex: Number)
    fun setHighFallTask(p1: Any, p2: Any, p3: Any)
    fun setIdRange(value: Number)
    fun setIkTarget(p1: Number, targetPed: Number, boneLookAt: Number, x: Number, y: Number, z: Number, p7: Any, duration: Number, duration1: Number)
    fun setIntoVehicle(vehicle: Number, seatIndex: Number)
    fun setInVehicleContext(context: Number)
    override fun setInvincible(toggle: Boolean)
    fun setKeepTask(toggle: Boolean)
    fun setLegIkMode(mode: Number)
    fun setLockon(toggle: Boolean)
    fun setLockonRangeOverride(range: Number)
    fun setLodMultiplier(multiplier: Number)
    fun setMaxArmour(value: Number)
    fun setMaxHealth(value: Number)
    fun setMaxMoveBlendRatio(value: Number)
    fun setMaxTimeInWater(value: Number)
    fun setMaxTimeUnderwater(value: Number)
    fun setMayNotEnterAnyVehicle()
    fun setMayOnlyEnterThisVehicle(vehicle: Number)
    fun setMeleeWeaponDamageModifier(modifier: Number)
    fun setMinGroundTimeForStungun(ms: Number)
    fun setMinMoveBlendRatio(value: Number)
    fun setModel(model: Number)
    fun setModelIsSuppressed(toggle: Boolean)
    fun setMoney(amount: Number)
    override fun setMotionBlur(toggle: Boolean)
    fun setMountedWeaponTarget(targetEntity: Number, p2: Any, x: Number, y: Number, z: Number)
    fun setMoveAnimsBlendOut()
    fun setMovementClipset(clipSet: String, p2: Number)
    fun setMoveRateOverride(value: Number)
    fun setNameDebug(name: String)
    fun setNeverLeavesGroup(toggle: Boolean)
    fun setNoiseMultiplier(multiplier: Number)
    fun setParachuteModelOverride(model: Number)
    fun setParachutePackModelOverride(model: Number)
    fun setParachutePackTintIndex(tintIndex: Number)
    fun setParachuteSmokeTrailColor(r: Number, g: Number, b: Number)
    fun setParachuteTaskTarget(x: Number, y: Number, z: Number)
    fun setParachuteTaskThrust(thrust: Number)
    fun setParachuteTintIndex(tintIndex: Number)
    fun setParachuteVariationOverride(p1: Number, p2: Any, p3: Any, p4: Boolean)
    fun setPathAvoidFire(avoidFire: Boolean)
    fun setPathCanDropFromHeight(Toggle: Boolean)
    fun setPathCanUseClimbovers(Toggle: Boolean)
    fun setPathCanUseLadders(Toggle: Boolean)
    fun setPathPreferToAvoidWater(avoidWater: Boolean)
    fun setPathsWidthPlant(mayEnterWater: Boolean)
    fun setPinnedDown(pinned: Boolean, i: Number)
    fun setPlaysHeadOnHornAnimWhenDiesInVehicle(toggle: Boolean)
    fun setPoliceIgnore(toggle: Boolean)
    fun setPreferredCoverSet(itemSet: Any)
    fun setPrimaryLookat(lookAt: Number)
    fun setPropIndex(componentId: Number, drawableId: Number, TextureId: Number, attach: Boolean)
    fun setRagdollFlag(flag: Number)
    fun setRagdollForceFall()
    fun setRagdollOnCollision(toggle: Boolean)
    fun setRandomComponentVariation(p1: Boolean)
    fun setRandomProps()
    fun setRelationshipGroupDefaultHash(hash: Number)
    fun setRelationshipGroupHash(hash: Number)
    fun setReserveParachuteTintIndex(tintIndex: Number)
    fun setResetFlag(flagId: Number, doReset: Boolean)
    fun setResetFlagPreferRearSeats(flags: Number)
    fun setResetRagdollFlag(flag: Number)
    fun setScriptedAnimSeatOffset(p1: Number)
    fun setSeeingRange(value: Number)
    fun setShootRate(shootRate: Number)
    fun setShootsAtCoord(x: Number, y: Number, z: Number, toggle: Boolean)
    fun setSimulateAiming(toggle: Boolean)
    fun setSneakingNoiseMultiplier(multiplier: Number)
    fun setSphereDefensiveArea(x: Number, y: Number, z: Number, radius: Number, p5: Boolean, p6: Boolean)
    fun setSprint(toggle: Boolean)
    fun setStayInVehicleWhenJacked(toggle: Boolean)
    fun setStealthMovement(p1: Boolean, action: String)
    fun setStealthPerceptionModifier(value: Number)
    fun setSteersAroundObjects(toggle: Boolean)
    fun setSteersAroundPeds(toggle: Boolean)
    fun setSteersAroundVehicles(toggle: Boolean)
    fun setStrafeClipset(clipSet: String)
    fun setSuffersCriticalHits(toggle: Boolean)
    fun setSweat(sweat: Number)
    fun setTargetLossResponse(responseType: Number)
    fun setTaskVehicleChaseBehaviorFlag(flag: Number, set: Boolean)
    fun setTaskVehicleChaseIdealPursuitDistance(distance: Number)
    fun setTeam(team: Number)
    fun setToInformRespectedFriends(radius: Number, maxFriends: Number)
    fun setToLoadCover(toggle: Boolean)
    fun setToRagdoll(time1: Number, time2: Number, ragdollType: Number, p4: Boolean, p5: Boolean, p6: Boolean): Boolean
    fun setUsingActionMode(p1: Boolean, p2: Any, action: String)
    fun setVehicleDamageModifier(damageAmount: Number)
    fun setVehicleDefenseModifier(modifier: Number)
    fun setVisualFieldCenterAngle(angle: Number)
    fun setVisualFieldMaxAngle(value: Number)
    fun setVisualFieldMaxElevationAngle(angle: Number)
    fun setVisualFieldMinAngle(value: Number)
    fun setVisualFieldMinElevationAngle(angle: Number)
    fun setVisualFieldPeripheralRange(range: Number)
    fun setWantedCentrePosition(x: Number, y: Number, z: Number)
    fun setWantedLevel(wantedLevel: Number, disableNoMission: Boolean)
    fun setWantedLevelNoDrop(wantedLevel: Number, p2: Boolean)
    fun setWantedLevelNow(p1: Boolean)
    fun setWeaponDamageModifier(damageAmount: Number)
    fun setWeaponDefenseModifier(modifier: Number)
    fun setWeaponMovementClipset(clipSet: String)
    fun setWetnessEnabledThisFrame()
    fun setWetnessHeight(height: Number)
    fun stopAnimPlayback(p1: Any, p2: Boolean)
    fun stopAnimTask(animDictionary: String, animationName: String, p3: Number)
    fun stopWeaponFiringWhenDropped()
    fun taskAchieveHeading(heading: Number, timeout: Number)
    fun taskAimGunAt(entity: Number, duration: Number, p3: Boolean)
    fun taskAimGunAtCoord(x: Number, y: Number, z: Number, time: Number, p5: Boolean, p6: Boolean)
    fun taskAimGunScripted(scriptTask: Number, p2: Boolean, p3: Boolean)
    fun taskArrest(target: Number)
    fun taskBoatMission(boat: Number, p2: Any, p3: Any, x: Number, y: Number, z: Number, p7: Any, maxSpeed: Number, p9: Any, p10: Number, p11: Any)
    fun taskChatTo(target: Number, p2: Any, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number)
    fun taskClearLookAt()
    fun taskClimb(unused: Boolean)
    fun taskClimbLadder(p1: Number)
    fun taskCombat(targetPed: Number, p2: Number, p3: Number)
    fun taskCombatHatedTargetsAround(radius: Number, p2: Number)
    fun taskCombatHatedTargetsInArea(x: Number, y: Number, z: Number, radius: Number, p5: Any)
    fun taskCower(duration: Number)
    fun taskDriveBy(targetPed: Number, p2: Any, targetX: Number, targetY: Number, targetZ: Number, p6: Number, p7: Any, p8: Boolean, firingPattern: Number)
    fun taskEnterVehicle(vehicle: Number, timeout: Number, seat: Number, speed: Number, p5: Number, p6: Any)
    fun taskFollowNavMeshToCoord(x: Number, y: Number, z: Number, speed: Number, timeout: Number, stoppingRange: Number, persistFollowing: Boolean, unk: Number)
    fun taskFollowNavMeshToCoordAdvanced(x: Number, y: Number, z: Number, speed: Number, timeout: Number, unkNumber: Number, unkInt: Number, unkX: Number, unkY: Number, unkZ: Number, unk2: Number)
    fun taskFollowPointRoute(speed: Number, unknown: Number)
    fun taskFollowToOffsetOf(entity: Number, offsetX: Number, offsetY: Number, offsetZ: Number, movementSpeed: Number, timeout: Number, stoppingRange: Number, persistFollowing: Boolean)
    fun taskForceMotionState(state: Number, p2: Boolean)
    fun taskGetOffBoat(boat: Number)
    fun taskGoStraightToCoord(x: Number, y: Number, z: Number, speed: Number, timeout: Number, targetHeading: Number, distanceToSlide: Number)
    fun taskGotoAiming(target: Number, distanceToStopAt: Number, StartAimingDist: Number)
    fun taskGoToCoordAndAimAtHatedEntitiesNearCoord(gotoX: Number, gotoY: Number, gotoZ: Number, aimNearX: Number, aimNearY: Number, aimNearZ: Number, speed: Number, shoot: Boolean, unknown1: Number, unknown2: Number, unkTrue: Boolean, unknown3: Number, heading: Boolean, firingPattern: Number)
    fun taskGoToCoordAnyMeans(x: Number, y: Number, z: Number, speed: Number, p5: Any, p6: Boolean, walkingStyle: Number, p8: Number)
    fun taskGoToCoordAnyMeansExtraParams(x: Number, y: Number, z: Number, speed: Number, p5: Any, p6: Boolean, walkingStyle: Number, p8: Number, p9: Any, p10: Any, p11: Any)
    fun taskGoToCoordAnyMeansExtraParamsWithCruiseSpeed(x: Number, y: Number, z: Number, speed: Number, p5: Any, p6: Boolean, walkingStyle: Number, p8: Number, p9: Any, p10: Any, p11: Any, p12: Any)
    fun taskGoToCoordWhileAimingAtCoord(x: Number, y: Number, z: Number, aimAtX: Number, aimAtY: Number, aimAtZ: Number, moveSpeed: Number, p8: Boolean, p9: Number, p10: Number, p11: Boolean, flags: Any, p13: Boolean, firingPattern: Number)
    fun taskGotoOffset(p1: Any, p2: Any, x: Number, y: Number, z: Number, duration: Number)
    fun taskGoToWhileAimingAtEntity(entityToWalkTo: Number, entityToAimAt: Number, speed: Number, shootatEntity: Boolean, p5: Number, p6: Number, p7: Boolean, p8: Boolean, firingPattern: Number)
    fun taskGuardCurrentPosition(p1: Number, p2: Number, p3: Number)
    fun taskGuardSphereDefensiveArea(p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Any, p7: Number, p8: Number, p9: Number, p10: Number)
    fun taskHandsUp(duration: Number, facingPed: Number, p3: Number, p4: Boolean)
    fun taskHeliChase(entityToFollow: Number, x: Number, y: Number, z: Number)
    fun taskHeliMission(vehicle: Number, p2: Any, pedToFollow: Number, posX: Number, posY: Number, posZ: Number, mode: Number, speed: Number, radius: Number, angle: Number, p11: Number, height: Number, p13: Number, p14: Number)
    fun taskJump(unused: Boolean)
    fun taskLeaveAnyVehicle(p1: Number, p2: Number)
    fun taskLeaveVehicle(vehicle: Number, flags: Number)
    fun taskLookAt(lookAt: Number, duration: Number, unknown1: Number, unknown2: Number)
    fun taskMoveNetwork(task: String, multiplier: Number, p3: Boolean, animDict: String, flags: Number)
    fun taskMoveNetworkAdvanced(p1: String, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Any, p9: Number, p10: Boolean, animDict: String, flags: Number)
    fun taskOpenVehicleDoor(vehicle: Number, timeOut: Number, doorIndex: Number, speed: Number)
    fun taskParachute(p1: Boolean)
    fun taskParachuteToTarget(x: Number, y: Number, z: Number)
    fun taskPatrol(p1: String, p2: Any, p3: Boolean, p4: Boolean)
    fun taskPause(ms: Number)
    fun taskPerformSequence(taskSequence: Number)
    fun taskPlaneChase(entityToFollow: Number, x: Number, y: Number, z: Number)
    fun taskPlaneLand(plane: Number, runwayStartX: Number, runwayStartY: Number, runwayStartZ: Number, runwayEndX: Number, runwayEndY: Number, runwayEndZ: Number)
    fun taskPlaneMission(plane: Number, targetVehicle: Number, targetPed: Number, destinationX: Number, destinationY: Number, destinationZ: Number, p7: Number, physicsSpeed: Number, p9: Number, p10: Number, maxAltitude: Number, minAltitude: Number)
    fun taskPlantBomb(x: Number, y: Number, z: Number, heading: Number)
    fun taskPlayAnim(animDictionary: String, animationName: String, speed: Number, speedmultiplier: Number, duration: Number, flag: Number, playbackRate: Number, lockX: Boolean, lockY: Boolean, lockZ: Boolean)
    fun taskPlayAnimAdvanced(animDict: String, animName: String, posX: Number, posY: Number, posZ: Number, rotX: Number, rotY: Number, rotZ: Number, speed: Number, speedmultiplier: Number, duration: Number, flag: Any, animTime: Number, p14: Any, p15: Any)
    fun taskPlayPhoneGestureAnimation(p1: Any, p2: Any, p3: Any, p4: Number, p5: Number, p6: Boolean, p7: Boolean)
    fun taskPutDirectlyIntoCover(x: Number, y: Number, z: Number, timeout: Any, p5: Boolean, p6: Number, p7: Boolean, p8: Boolean, p9: Any, p10: Boolean)
    fun taskPutDirectlyIntoMelee(meleeTarget: Number, p2: Number, p3: Number, p4: Number, p5: Boolean)
    fun taskRappelFromHeli(p1: Number)
    fun taskReactAndFlee(fleeTarget: Number)
    fun taskReloadWeapon(doReload: Boolean)
    fun taskScriptedAnimation(p1: Any, p2: Any, p3: Any, p4: Number, p5: Number)
    fun taskSeekCoverFrom(target: Number, duration: Number, p3: Boolean)
    fun taskSeekCoverToCoords(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, p7: Any, p8: Boolean)
    fun taskSetBlockingOfNonTemporaryEvents(toggle: Boolean)
    fun taskSetDecisionMaker(p1: Number)
    fun taskShockingEventReact(eventHandle: Number)
    fun taskShootAtCoord(x: Number, y: Number, z: Number, duration: Number, firingPattern: Number)
    fun taskShuffleToNextVehicleSeat(vehicle: Number)
    fun taskSkyDive()
    fun taskSlideToCoord(x: Number, y: Number, z: Number, heading: Number, p5: Number)
    fun taskSlideToCoordHdgRate(x: Number, y: Number, z: Number, heading: Number, p5: Number, p6: Number)
    fun taskSmartFlee(fleeTarget: Number, distance: Number, fleeTime: Any, p4: Boolean, p5: Boolean)
    fun taskSmartFleeCoord(x: Number, y: Number, z: Number, distance: Number, time: Number, p6: Boolean, p7: Boolean)
    fun taskStandGuard(x: Number, y: Number, z: Number, heading: Number, scenarioName: String)
    fun taskStandStill(time: Number)
    fun taskStartScenarioAtPosition(scenarioName: String, x: Number, y: Number, z: Number, heading: Number, p6: Any, p7: Boolean, p8: Boolean)
    fun taskStartScenarioInPlace(scenarioName: String, unkDelay: Number, playEnterAnim: Boolean)
    fun taskStayInCover()
    fun taskStealthKill(target: Number, killType: Number, p3: Number, p4: Boolean)
    fun taskStopPhoneGestureAnimation()
    fun taskSwapWeapon(p1: Boolean)
    fun taskSweepAim(anim: String, p2: String, p3: String, p4: String, p5: Number, vehicle: Number, p7: Number, p8: Number)
    fun taskSynchronizedScene(scene: Number, animDictionary: String, animationName: String, speed: Number, speedmultiplier: Number, duration: Number, flag: Number, playbackRate: Number, p9: Any)
    fun taskTurnToFace(entity: Number, duration: Number)
    fun taskTurnToFaceCoord(x: Number, y: Number, z: Number, duration: Number)
    fun taskUseMobilePhone(p1: Number)
    fun taskUseMobilePhoneTimed(duration: Number)
    fun taskUseNearestScenarioToCoordWarp(x: Number, y: Number, z: Number, radius: Number, p5: Any)
    fun taskVehicleAimAt(target: Number)
    fun taskVehicleChase(targetEnt: Number)
    fun taskVehicleDriveToCoord(vehicle: Number, x: Number, y: Number, z: Number, speed: Number, p6: Any, vehicleModel: Number, drivingMode: Number, stopRange: Number, p10: Number)
    fun taskVehicleDriveToCoordLongrange(vehicle: Number, x: Number, y: Number, z: Number, speed: Number, driveMode: Number, stopRange: Number)
    fun taskVehicleDriveWander(vehicle: Number, speed: Number, drivingStyle: Number)
    fun taskVehicleEscort(vehicle: Number, targetVehicle: Number, mode: Number, speed: Number, drivingStyle: Number, minDistance: Number, p7: Number, noRoadsDistance: Number)
    fun taskVehicleFollow(vehicle: Number, targetEntity: Number, drivingStyle: Number, speed: Number, minDistance: Number)
    fun taskVehicleFollowWaypointRecording(vehicle: Number, WPRecording: String, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Boolean, p9: Number)
    fun taskVehicleGotoNavmesh(vehicle: Number, x: Number, y: Number, z: Number, speed: Number, behaviorFlag: Number, stoppingRange: Number)
    fun taskVehicleHeliProtect(vehicle: Number, entityToFollow: Number, targetSpeed: Number, p4: Number, radius: Number, altitude: Number, p7: Number)
    fun taskVehicleMissionCoorsTarget(vehicle: Number, x: Number, y: Number, z: Number, p5: Number, p6: Number, p7: Number, p8: Number, p9: Number, p10: Boolean)
    fun taskVehicleMissionTarget(vehicle: Number, pedTarget: Number, mode: Number, maxSpeed: Number, drivingStyle: Number, minDistance: Number, p7: Number, p8: Boolean)
    fun taskVehiclePark(vehicle: Number, x: Number, y: Number, z: Number, heading: Number, mode: Number, radius: Number, keepEngineOn: Boolean)
    fun taskVehicleShootAt(target: Number, p2: Number)
    fun taskVehicleTempAction(vehicle: Number, action: Number, time: Number)
    fun taskWanderInArea(x: Number, y: Number, z: Number, radius: Number, minimalLength: Number, timeBetweenWalks: Number)
    fun taskWanderStandard(p1: Number, p2: Number)
    fun taskWarpIntoVehicle(vehicle: Number, seat: Number)
    fun taskWrithe(target: Number, time: Number, p3: Number)
    fun uncuff()
    fun unregisterheadshot()
    fun updateHeadBlendData(shapeMix: Number, skinMix: Number, thirdMix: Number)
    fun updateTaskAimGunScriptedTarget(p1: Number, p2: Number, p3: Number, p4: Number, p5: Boolean)
    fun updateTaskHandsUpDuration(duration: Number)
    fun updateTaskSweepAim(entity: Number)
    fun wasKilledByStealth(): Boolean
    fun wasKilledByTakedown(): Boolean
    fun wasSkeletonUpdated(): Boolean
}

external interface MpPool<TEntity> {
    var length: Int
    var size: Int

    fun at(index: Int): TEntity
    fun exists(entity: TEntity): Boolean
    fun foreach(function: (entity: TEntity, index: Int?) -> Nothing)
}

external interface MpRaycasting {
    fun testPointToPoint(startPos: MpVector3, endPos: MpVector3, ignoreEntity: Array<MpEntity>? = definedExternally, flags: Int? = definedExternally): MpRaycastResult
    fun testCapsule(startPos: MpVector3, endPos: MpVector3, radius: Number, ignoreEntity: Array<MpEntity>? = definedExternally, flags: Array<Int>): MpRaycastResult
}

external interface MpStorage {
    fun flush()
    var data: JSON
}

external interface MpTextLabel {
    var color: MpRgb
    var drawDistance: Number
    var font: Int
    var los: Boolean
    var text: String
}

external interface MpVehicle {
    var gear: Int
    var rpm: Number
    var steeringAngle: Number

    // Todo: Change all Numbers

    fun addUpsidedownCheck()
    fun areAllWindowsIntact(): Boolean
    fun attachToCargobob(cargobob: Number, p1: Number, x: Number, y: Number, z: Number)
    fun attachToTowTruck(vehicle: Number, rear: Boolean, hookOffsetX: Number, hookOffsetY: Number, hookOffsetZ: Number)
    fun attachToTrailer(trailer: Number, radius: Number)
    fun canShuffleSeat(p0: Any): Boolean
    fun cargobobMagnetGrab(toggle: Boolean)
    fun clearCustomPrimaryColour()
    fun clearCustomSecondaryColour()
    fun closeBombBayDoors()
    fun detachFromAnyCargobob(): Boolean
    fun detachFromAnyTowTruck(): Boolean
    fun detachFromCargobob(cargobob: Number)
    fun detachFromTowTruck(vehicle: Number)
    fun detachFromTrailer()
    fun detachWindscreen()
    fun disableImpactExplosionActivation(toggle: Boolean)
    fun disablePlaneAileron(p0: Boolean, p1: Boolean)
    fun doesExtraExist(extraId: Number): Boolean
    fun doesHaveRoof(): Boolean
    fun doesHaveStuckVehicleCheck(): Boolean
    fun doesHaveWeapon(): Boolean
    fun ejectJb700Roof(x: Number, y: Number, z: Number)
    fun enableCargobobHook(state: Number)
    fun explode(isAudible: Boolean, isInvisble: Boolean)
    fun explodeInCutscene(p0: Boolean)
    fun fixWindow(index: Number)
    fun getAcceleration(): Number
    fun getAttachedToCargobob(): Number
    fun getAttachedToTowTruck(): Number
    fun getBoatAnchor(): Boolean
    fun getBodyHealth(): Number
    fun getBodyHealth2(): Number
    fun getCargobobHookPosition(): MpVector3
    fun getCauseOfDestruction(): Number
    fun getClass(): Number
    fun getColor(r: Number, g: Number, b: Number): MpRgb
    fun getColourCombination(): Number
    fun getColours(colorPrimary: Number, colorSecondary: Number): MpVehicleColors
    fun getConvertibleRoofState(): Number
    fun getCustomPrimaryColour(r: Number, g: Number, b: Number): MpRgb
    fun getCustomSecondaryColour(r: Number, g: Number, b: Number): MpRgb
    fun getDeformationAtPos(offsetX: Number, offsetY: Number, offsetZ: Number): MpVector3
    fun getDirtLevel(): Number
    fun getDoorAngleRatio(door: Number): Number
    fun getDoorLockStatus(): Number
    fun getDoorsLockedForPlayer(player: Number): Boolean
    fun getEngineHealth(): Number
    fun getExtraColours(pearlescentColor: Number, wheelColor: Number): MpVehicleExtraColors
    fun getHeliEngineHealth(): Number
    fun getHeliMainRotorHealth(): Number
    fun getHeliTailRotorHealth(): Number
    fun getIsEngineRunning(): Boolean
    fun getIsLeftHeadlightDamaged(): Boolean
    fun getIsPrimaryColourCustom(): Boolean
    fun getIsRightHeadlightDamaged(): Boolean
    fun getIsSecondaryColourCustom(): Boolean
    fun getLandingGearState(): Number
    fun getLastPedInSeat(seatIndex: Number): Number
    fun getLayoutHash(): Number
    fun getLightsState(lightsOn: Boolean, highbeamsOn: Boolean): MpVehicleLightState
    fun getLivery(): Number
    fun getLiveryCount(): Number
    fun getLiveryName(liveryIndex: Number): String
    fun getMaxBreaking(): Number
    fun getMaxNumberOfPassengers(): Number
    fun getMaxTraction(): Number
    fun getMod(modType: Number): Number
    fun getModColor1(paintType: Number, color: Number, p2: Number): MpVehicleModColor
    fun getModColor1TextLabel(p0: Boolean): String
    fun getModColor2(paintType: Number, color: Number): MpVehicleModColor
    fun getModColor2TextLabel(): String
    fun getModKit(): Number
    fun getModKitType(): Number
    fun getModModifierValue(modType: Number, modIndex: Number)
    fun getModSlotName(modType: Number): String
    fun getModTextLabel(modType: Number, modValue: Number): String
    fun getModVariation(modType: Number): Boolean
    fun getNeonLightsColour(r: Number, g: Number, b: Number): MpRgb
    fun getNumberOfColours(): Number
    fun getNumberOfPassengers(): Number
    fun getNumberPlateText(): String
    fun getNumberPlateTextIndex(): Number
    fun getNumModKits(): Number
    fun getNumMods(modType: Number): Number
    fun getOwner(entity: Number): Boolean
    fun getPaintFade(): Number
    fun getPedInSeat(index: Number): Number
    fun getPedUsingDoor(doorIndex: Number): Number
    fun getPetrolTankHealth(): Number
    fun getPlateType(): Number
    fun getSuspensionHeight(): Number
    fun getTrailer(vehicle: Number): Number
    fun getTrainCarriage(cariage: Number): Number
    fun getTyresCanBurst(): Boolean
    fun getTyreSmokeColor(r: Number, g: Number, b: Number): MpRgb
    fun getVehicleTrailer(vehicle: Number): Number
    fun getWheelType(): Number
    fun getWindowTint(): Number
    fun isAConvertible(p0: Boolean): Boolean
    fun isAlarmActivated(): Boolean
    fun isAnySeatEmpty(): Boolean
    fun isAttachedToCargobob(vehicleAttached: Number): Boolean
    fun isAttachedToTowTruck(vehicle: Number): Boolean
    fun isAttachedToTrailer(): Boolean
    fun isBig(): Boolean
    fun isBumberBrokenOff(front: Boolean): Boolean
    fun isCargobobHookActive(): Boolean
    fun isCargobobMagnetActive(): Boolean
    fun isDamaged(): Boolean
    fun isDoorDamaged(doorId: Number): Boolean
    fun isDriveable(p0: Boolean): Boolean
    fun isExtraTurnedOn(extraId: Number): Boolean
    fun isHeliPartBroken(p0: Boolean, p1: Boolean, p2: Boolean): Boolean
    fun isHighDetail(): Boolean
    fun isInBurnout(): Boolean
    fun isModel(model: Number): Boolean
    fun isNeaonLightEnabled(index: Number): Boolean
    fun isOnAllWheels(): Boolean
    fun isSearchlightOn(): Boolean
    fun isSeatFree(seatIndex: Number): Boolean
    fun isSirenOn(): Boolean
    fun isSirenSoundOn(): Boolean
    fun isStolen(): Boolean
    fun isStopped(): Boolean
    fun isStoppedAtTrafficLights(): Boolean
    fun isStuckOnRoof(): Boolean
    fun isStuckTimerUp(p0: Number, p1: Number): Boolean
    fun isTaxiLightOn(): Boolean
    fun isToggleModOn(modType: Number): Boolean
    fun isTyreBurst(wheelId: Number, completely: Boolean): Boolean
    fun isVisible(): Boolean
    fun isWindowIntact(windowIndex: Number): Boolean
    fun jitter(p0: Boolean, yaw: Number, pitch: Number, roll: Number)
    fun lowerConvertibleRoof(instantlyLower: Boolean)
    fun movable(): Boolean
    fun openBombBayDoors()
    fun raiseConvertibleRoof(instantlyRaise: Boolean)
    fun releasePreloadMods()
    fun removeHighDetailModel()
    fun removeMod(modType: Number)
    fun removeUpsidedownCheck()
    fun removeWindow(windowIndex: Number)
    fun requestHighDetailModel()
    fun resetStuckTimer(reset: Boolean)
    fun resetWheels(toggle: Boolean)
    fun retractCargobobHook()
    fun rollDownWindow(windowIndex: Number)
    fun rollDownWindows()
    fun rollUpWindow(windowIndex: Number)
    fun setAlarm(state: Boolean)
    fun setAllowNoPassengersLockon(toggle: Boolean)
    fun setAllsSpawns(p0: Boolean, p1: Boolean, p2: Boolean)
    fun setAutomaticallyAttaches(p0: Any, p1: Any)
    fun setBikeLeanAngle(x: Number, y: Number)
    fun setBoatAnchor(toggle: Boolean)
    fun setBodyHealth(value: Number)
    fun setBreakLights(toggle: Boolean)
    fun setBurnout(toggle: Boolean)
    fun setCanBeTargetted(state: Boolean)
    fun setCanBeUsedByFleeingPeds(toggle: Boolean)
    fun setCanBeVisiblyDamaged(state: Boolean)
    fun setCanBreak(toggle: Boolean)
    fun setCanRespray(state: Boolean)
    fun setCeilingHeight(p0: Number)
    fun setColourCombination(numCombos: Number)
    fun setColours(colorPrimary: Number, colorSecondary: Number)
    fun setConvertibleRoof(p0: Boolean)
    fun setCreatesMoneyPickupsWhenExploded(toggle: Boolean)
    fun setCustomPrimaryColour(r: Number, g: Number, b: Number)
    fun setCustomSecondaryColour(r: Number, g: Number, b: Number)
    fun setDamage(xOffset: Number, yOffset: Number, zOffset: Number, damage: Number, radius: Number, p5: Boolean)
    fun setDeformationFixed()
    fun setDirtLevel(dirtLevel: Number)
    fun setDisablePetrolTankDamage(toggle: Boolean)
    fun setDisablePetrolTankFires(toggle: Boolean)
    fun setDoorBreakable(doorIndex: Number, isBreakable: Boolean)
    fun setDoorBroken(doorIndex: Number, createDoorObject: Boolean)
    fun setDoorControl(doorIndex: Number, speed: Number, angle: Number)
    fun setDoorLatched(doorIndex: Number, p1: Boolean, p2: Boolean, p3: Boolean)
    fun setDoorOpen(doorIndex: Number, loose: Boolean, openInstantly: Boolean)
    fun setDoorShut(doorIndex: Number, closeInstantly: Boolean)
    fun setDoorsLocked(doorLockStatus: Number)
    fun setDoorsLockedForAllPlayers(toggle: Boolean)
    fun setDoorsLockedForPlayer(player: Number, toggle: Boolean)
    fun setDoorsLockedForTeam(team: Number, toggle: Boolean)
    fun setDoorsShut(closeInstantly: Boolean)
    fun setEngineCanDegrade(toggle: Boolean)
    fun setEngineHealth(health: Number)
    fun setEngineOn(value: Boolean, instantly: Boolean, otherwise: Boolean)
    fun setEnginePowerMultiplier(value: Number)
    fun setEngineTorqueMultiplier(value: Number)
    fun setExclusiveDriver(ped: Number, p1: Number)
    fun setExplodesOnHighExplosionDamage(toggle: Boolean)
    fun setExtra(extraId: Number, toggle: Boolean)
    fun setExtraColours(pearlescentColor: Number, wheelColor: Number)
    fun setFixed()
    fun setForwardSpeed(speed: Number)
    fun setFrictionOverride(friction: Number)
    fun setFullbeam(toggle: Boolean)
    fun setGravity(toggle: Boolean)
    fun setHalt(distance: Number, killEngine: Boolean, unknown: Boolean)
    fun setHandbrake(toggle: Boolean)
    fun setHandling(vararg value: Any)
    fun setHasBeenOwnedByPlayer(owned: Boolean)
    fun setHasStrongAxles(toggle: Boolean)
    fun setHeliBladesFullSpeed()
    fun setHeliBladeSpeed(speed: Number)
    fun setHelicopterRollPitchYawMult(multiplier: Number)
    fun setIndicatorLights(turnSignal: Number, toggle: Boolean)
    fun setInteriorLight(toggle: Boolean)
    fun setIsConsideredByPlayer(toggle: Boolean)
    fun setIsStolen(isStolen: Boolean)
    fun setIsWanted(state: Boolean)
    fun setJetEngineOn(toggle: Boolean)
    fun setLandingGear(state: Number)
    fun setLightMultiplier(multiplier: Number)
    fun setLights(state: Number)
    fun setLights(state: Boolean)
    fun setLivery(livery: Number)
    fun setLodMultiplier(multiplier: Number)
    fun setMissionTrainCoords(x: Number, y: Number, z: Number)
    fun setMod(modType: Number, modIndex: Number, customTires: Boolean)
    fun setModColor1(paintType: Number, color: Number, p2: Number)
    fun setModColor2(paintType: Number, color: Number)
    fun setModKit(modKit: Number)
    fun setNameDebug(name: String)
    fun setNeedsToBeHotwired(toggle: Boolean)
    fun setNeonLightEnabled(index: Number, toggle: Boolean)
    fun setNeonLightsColour(r: Number, g: Number, b: Number)
    fun setNumberPlateText(plateText: String)
    fun setNumberPlateTextIndex(plateIndex: Number)
    fun setOnGroundProperly(): Boolean
    fun setOutOfControl(killDriver: Boolean, explodeOnImpact: Boolean)
    fun setPaintFade(fade: Number)
    fun setPedEnabledBikeRingtone(p0: Any): Boolean
    fun setPedTargettableDestory(vehicleComponent: Number, destroyType: Number)
    fun setPetrolTankHealth(fix: Number)
    fun setPlaneMinHeightAboveGround(height: Number)
    fun setPlaybackToUseAi(flag: Number)
    fun setPlayersLast()
    fun setProvidesCover(toggle: Boolean)
    fun setReduceGrip(toggle: Boolean)
    fun setRenderTrainAsDerailed(toggle: Boolean)
    fun setRudderBroken(p0: Boolean)
    fun setSearchlight(toggle: Boolean, canBeUsedByAI: Boolean)
    fun setSilent(toggle: Boolean)
    fun setSiren(toggle: Boolean)
    fun setSteerBias(value: Number)
    fun setStrong(toggle: Boolean)
    fun setTaxiLight(state: Boolean)
    fun setTimedExplosion(ped: Number, toggle: Boolean)
    fun setTowTruckCraneHeight(height: Number)
    fun setTrainCruiseSpeed(speed: Number)
    fun setTrainSpeed(speed: Number)
    fun setTyreBurst(tyreIndex: Number, onRim: Boolean, p2: Number)
    fun setTyreFixed(tyreIndex: Number)
    fun setTyresCanBurst(toggle: Boolean)
    fun setTyreSmokeColor(r: Number, g: Number, b: Number)
    fun setUndriveable(toggle: Boolean)
    fun setWheelsCanBreak(enabled: Boolean)
    fun setWheelsCanBreakOffWhenBlowUp(toggle: Boolean)
    fun setWheelType(wheelType: Number)
    fun setWindowTint(tint: Number)
    fun smashWindow(index: Number)
    fun startAlarm()
    fun startHorn(duration: Number, model: Number, forever: Boolean)
    fun steerUnlockBias(toggle: Boolean)
    fun toggleMod(modType: Number, toggle: Boolean)
    fun trackVisibility()
    fun wasCounterActivated(p0: Any): Boolean
}





external interface MpGame {
    var app: MpGameApp
    var audio: MpGameAudio
    var brain: MpGameBrain
    var cam: MpGameCam
    var controls: MpGameControls
    var cutscene: MpGameCutscene
    var datafile: MpGameDatafile
    var decisionevent: MpGameDecisionevent
    var decorator: MpGameDecorator
    var dlc1: MpGameDlc1
    var dlc2: MpGameDlc2
    var entity: MpGameEntity
    var fire: MpGameFireMp
    var gameplay: MpGameGameplay
    var graphics: MpGameGraphics
    var interior: MpGameInterior
    var itemset: MpGameItemset
    var mobile: MpGameMobile
    var `object`: MpGameObject
    var pathfind: MpGamePathfind
    var ped: MpGamePed
    var player: MpGamePlayer
    var rope: MpGameRope
    var script: MpGameScript
    var stats: MpGameStats
    var streaming: MpGameStreaming
    var system: MpGameSystem
    var time: MpGameTime
    var ui: MpGameUi
    var unk: MpGameUnk
    var recorderGameRecorder: MpGameRecorder
    var vehicle: MpGameVehicle
    var water: MpGameWater
    var weapon: MpGameWeapon
    var worldprobe: MpGameWorldprobe
    var zone: MpGameZone
    fun invoke(hash: String, vararg args: Any): Any
    fun joaat(text: String): Int
    fun joaat(textArray: Array<String>): Array<String>
}

external interface MpGameApp {
    fun appDeleteAppData(appName: String): Boolean
    fun appGetNumber(property: String): Number
    fun appGetString(property: String): String
    fun appGetInt(property: String): Number
    fun appHasSyncedData(property: String): Boolean
    fun appSetApp(appName: String)
    fun appSetBlock(blockName: String)
    fun appSetNumber(property: String, value: Number)
    fun appSetInt(property: String, value: Number)
    fun appSetString(property: String, value: String)
}

external interface MpGameAudio {
    fun addLineToConversation(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Boolean, p6: Boolean, p7: Boolean, p8: Boolean, p9: Any, p10: Boolean, p11: Boolean, p12: Boolean)
    fun addPedToConversation(p0: Any, p1: Any, p2: String)
    fun cancelMusicEvent(eventName: String): Boolean
    fun clearAmbientZoneListState(p0: Any, p1: Boolean)
    fun clearAmbientZoneState(p0: Any, p1: Boolean)
    fun findRadioStationIndex(station: Number): Number
    fun freezeRadioStation(radioStation: String)
    fun getNetworkIdFromSoundId(soundId: Number): Number
    fun getNumberOfPassengerVoiceVariations(p0: Any): Number
    fun getPlayerHeadsetSoundAlternate(p0: String, p1: Number)
    fun getRadioStationName(radioStation: Number): String
    fun getSoundIdFromNetworkId(netId: Number): Number
    fun getSynchronizedAudioEventPositionThisFrame(p0: String, p1: Number)
    fun getVehicleDefaultHorn(vehicle: Number): Number
    fun hasSoundFinished(soundId: Number): Boolean
    fun hintAmbientAudioBank(p0: Any, p1: Any)
    fun hintScriptAudioBank(p0: Any, p1: Any)
    fun interruptConversation(p0: Any, p1: Any, p2: Any)
    fun isAlarmPlayer(alarmName: String): Boolean
    fun isAmbientSpeechPlaying(p0: Number): Boolean
    fun isAmbientZoneEnabled(ambientZone: String): Boolean
    fun isAudioSceneActive(scene: String): Boolean
    fun isScriptedSpeechPlaying(p0: Any): Boolean
    fun loadStream(streamName: String, soundSet: String): Boolean
    fun loadStreamWithStartOffset(streamName: String, startOffset: Number, soundSet: String): Boolean
    fun overrideTrevorRage(p0: Any)
    fun overrideUnderwaterStream(p0: Any, p1: Boolean)
    fun pauseScriptedConversation(p0: Boolean)
    fun playAmbientSpeechAtCoords(p0: String, p1: String, p2: Number, p3: Number, p4: Number, p5: String)
    fun playAmbientSpeechWithVoice(p0: Number, speechName: String, voiceName: String, speechParam: String, p4: Boolean)
    fun playEndCreditsMusic(play: Boolean)
    fun playMissionCompleteAudio(audioName: String)
    fun playPain(painId: Number, p1: Number, p2: Number)
    fun playPedRingtone(ringtoneName: String, ped: Number, p2: Boolean)
    fun playPoliceReport(name: String, p1: Number)
    fun playSound(soundId: Number, audioName: String, audioRef: String, p3: Boolean, p4: Any, p5: Boolean)
    fun playSoundFromCoord(soundId: Number, audioName: String, x: Number, y: Number, z: Number, audioRef: String, p6: Boolean, p7: Any, p8: Boolean)
    fun playSoundFromEntity(soundId: Number, audioName: String, entity: Number, audioRef: String, p4: Boolean, p5: Any)
    fun playSoundFrontend(soundId: Number, audioName: String, audioRef: String, p3: Boolean)
    fun playStreamFromObject(`object`: Number)
    fun playSynchronizedAudioEvent(p0: Any): Boolean
    fun preloadScriptConversation(p0: Boolean, p1: Boolean, p2: Boolean, p3: Boolean)
    fun preloadScriptPhoneConversation(p0: Boolean, p1: Boolean)
    fun prepareAlarm(alarmName: String): Boolean
    fun prepareMusicEvent(eventName: String): Boolean
    fun prepareSynchronizedAudioEvent(p0: String, p1: Any)
    fun prepareSynchronizedAudioEventForScene(p0: Any, p1: Any): Boolean
    fun registerScriptWithAudio(p0: Any)
    fun releasedNamedScriptAudioBank(audioBank: String)
    fun releaseSoundId(soundId: Number)
    fun requestAmbientAudioBank(p0: String, p1: Boolean): Boolean
    fun requestMissionAudioBank(p0: String, p1: Boolean): Boolean
    fun requestScriptAudioBank(p0: String, p1: Boolean): Boolean
    fun resetPedAudioFlags(p0: Any)
    fun setAggressiveHorns(toggle: Boolean)
    fun setAmbientZoneListState(p0: Any, p1: Boolean, p2: Boolean)
    fun setAmbientZoneListStatePersistent(ambientZone: String, p1: Boolean, p2: Boolean)
    fun setAmbientZoneState(p0: Any, p1: Boolean, p2: Boolean)
    fun setAmbientZoneStatePersistent(ambientZone: String, p1: Boolean, p2: Boolean)
    fun setAnimalMood(p0: Any, p1: Any)
    fun setAudioFlag(flagName: String, toggle: Boolean)
    fun setAudioSceneVariable(p0: Any, p1: Any, p2: Number)
    fun setCutsceneAudioOverride(p0: String)
    fun setEmitterRadioStation(emitterName: String, radioStation: String)
    fun setFrontendRadioActive(active: Boolean)
    fun setGpsActive(active: Boolean)
    fun setInitialPlayerStation(radioStation: String)
    fun setMicrophonePosition(p0: Boolean, x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, x3: Number, y3: Number, z3: Number)
    fun setMobilePhoneRadioState(state: Boolean)
    fun setMobileRadioEnabledDuringGameplay(toggle: Boolean)
    fun setPlayerAngry(playerPed: Number, disabled: Boolean)
    fun setRadioAutoUnfreeze(p0: Boolean)
    fun setRadioToStationIndex(radioStation: Number)
    fun setRadioToStationName(stationName: String)
    fun setRadioTrack(radioStation: String, radioTrack: String)
    fun setStaticEmitterEnabled(emitterName: String, toggle: Boolean)
    fun setUserRadioControlEnabled(p0: Boolean)
    fun setVariableOnSound(soundId: Number, p1: Any, p2: Number)
    fun setVariableOnStream(p0: String, p1: Number)
    fun specialFrontendEqual(x: Number, y: Number, z: Number)
    fun startAlarm(alarmName: String, p2: Boolean)
    fun startAudioScene(sceneName: String): Boolean
    fun startScriptConversation(p0: Boolean, p1: Boolean, p2: Boolean, p3: Boolean)
    fun startScriptPhoneConversation(p0: Boolean, p1: Boolean)
    fun stopAlarm(alarmName: String, toggle: Boolean)
    fun stopAllAlarms(stop: Boolean)
    fun stopAudioScene(scene: String)
    fun stopCurrentPlayerAmbientSpeech(p0: Number)
    fun stopScriptedConversation(p0: Boolean)
    fun stopSound(soundId: Number)
    fun stopSynchronizedAudioEvent(p0: Any): Boolean
    fun triggerMusicEvent(eventName: String): Boolean
    fun unfreezeRadioStation(radioStation: String)
    fun unlockMissionNewsStory(newsStory: Number)
}

external interface MpGameBrain {
    fun addScriptToRandom(name: String, model: Number, p2: Number, p3: Number)
    fun disableScriptBrainSet(brainSet: Number)
    fun enableScriptBrainSet(brainSet: Number)
    fun isObjectWithinBrainActivationRange(`object`: Number): Boolean
    fun registerObjectScriptBrain(stringName: String, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number)
    fun registerWorldPointScriptBrain(p0: Any, p1: Number, p2: Any)
}

external interface MpGameCam {
    fun addCamSplineNode(camera: Number, x: Number, y: Number, z: Number, xRot: Number, yRot: Number, zRot: Number, length: Number, p8: Number, p9: Number)
    fun animateGameplayCamZoom(p0: Number, distance: Number)
    fun clampGameplayCamPitch(minimum: Number, maximum: Number)
    fun clampGameplayCamYaw(minimum: Number, maximum: Number)
    fun createCam(camName: String, p1: Boolean): Number
    fun createCamera(camHash: Number, p1: Boolean): Number
    fun createCameraWithParams(camHash: Number, posX: Number, posY: Number, posZ: Number, rotX: Number, rotY: Number, rotZ: Number, fov: Number, p8: Boolean, p9: Any): Number
    fun createCamWithParams(camName: String, posX: Number, posY: Number, posZ: Number, rotX: Number, rotY: Number, rotZ: Number, fov: Number, p8: Boolean, p9: Any): Number
    fun createCinematicShot(p0: Any, p1: Number, p2: Any, entity: Number)
    fun destroyAllCams(destroy: Boolean)
    fun doScreenFadeIn(duration: Number)
    fun doScreenFadeOut(duration: Number)
    fun getCamSplineNodeIndex(cam: Number): Boolean
    fun getCamSplineNodePhase(p0: Any): Number
    fun getGameplayCamRelativeHeading(): Number
    fun getGameplayCamRot(p0: Number): MpVector3
    fun getGameplayCamRot(p0: Number): MpVector3
    fun getIsMultiplayerBrief(p0: Boolean)
    fun isCamSplinePaused(p0: Any): Boolean
    fun isCinematicShotActive(p0: Any): Boolean
    fun isSphereVisible(x: Number, y: Number, z: Number, radius: Number): Boolean
    fun overrideCamSplineMotionBlur(p0: Any, p1: Any, p2: Number, p3: Number)
    fun overrideCamSplineVelocity(cam: Number, p1: Number, p2: Number, p3: Number)
    fun playSynchronizedCamAnim(p0: Any, p1: Any, animName: String, animDictionary: String): Boolean
    fun renderScriptCams(render: Boolean, ease: Boolean, easeTime: Number, p3: Boolean, p4: Boolean)
    fun setCamEffect(p0: Number)
    fun setCamSplineDuration(cam: Number, timeDuration: Number)
    fun setCamSplinePhase(cam: Number, p1: Number)
    fun setCinematicButtonActive(p0: Boolean)
    fun setCinematicCamShakeAmplitude(p0: Number)
    fun setCinematicModeActive(p0: Boolean)
    fun setFollowPedCamCutsceneChat(p0: String, p1: Number)
    fun setFollowPedCamViewMode(viewMode: Number)
    fun setFollowVehicleCamViewMode(viewMode: Number)
    fun setFollowVehicleCamZoomLevel(zoomLevel: Number)
    fun setGameplayCamRawPitch(pitch: Number)
    fun setGameplayCamRawYaw(yaw: Number)
    fun setGameplayCamRelativeHeading(heading: Number)
    fun setGameplayCamRelativePitch(x: Number, p1: Number)
    fun setGameplayCamShakeAmplitude(amplitude: Number)
    fun setGameplayCoordHint(p0: Number, p1: Number, p2: Number, p3: Any, p4: Any, p5: Any, p6: Any)
    fun setGameplayEntityHint(p0: Any, p1: Number, p2: Number, p3: Number, p4: Boolean, p5: Any, p6: Any, p7: Any, p8: Any)
    fun setGameplayHintFov(fov: Number)
    fun setGameplayObjectHint(p0: Any, p1: Number, p2: Number, p3: Number, p4: Boolean, p5: Any, p6: Any, p7: Any)
    fun setGameplayPedHint(p0: Number, x1: Number, y1: Number, z1: Number, p4: Boolean, p5: Any, p6: Any, p7: Any)
    fun setGameplayVehicleHint(p0: Any, p1: Number, p2: Number, p3: Number, p4: Boolean, p5: Any, p6: Any, p7: Any)
    fun setTimeIdleDrop(p0: Boolean, p1: Boolean)
    fun setWidescreenBorders(p0: Boolean, p1: Number)
    fun shakeCinematicCam(p0: String, p1: Number)
    fun shakeGameplayCam(shakeName: String, intensity: Number)
    fun stopCinematicCamShaking(p0: Boolean)
    fun stopCinematicShot(p0: Any)
    fun stopGameplayCamShaking(p0: Boolean)
    fun stopGameplayHint(p0: Boolean)
}

external interface MpGameControls {
    fun disableAllControlActions(inputGroup: Number)
    fun disableControlAction(inputGroup: Number, control: Number, disable: Boolean)
    fun enableAllControlActions(inputGroup: Number)
    fun enableControlAction(inputGroup: Number, control: Number, enable: Boolean)
    fun getControlActionName(inputGroup: Number, control: Number, p2: Boolean): String
    fun getControlNormal(inputGroup: Number, control: Number): Number
    fun getControlValue(inputGroup: Number, control: Number): Number
    fun getDisabledControlNormal(inputGroup: Number, control: Number): Number
    fun isControlEnabled(inputGroup: Number, control: Number): Boolean
    fun isControlJustPressed(inputGroup: Number, control: Number): Boolean
    fun isControlJustReleased(inputGroup: Number, control: Number): Boolean
    fun isControlPressed(inputGroup: Number, control: Number): Boolean
    fun isControlReleased(inputGroup: Number, control: Number): Boolean
    fun isDisabledControlJustPressed(inputGroup: Number, control: Number): Boolean
    fun isDisabledControlJustReleased(inputGroup: Number, control: Number): Boolean
    fun isInputDisabled(inputGroup: Number): Boolean
    fun isInputJustDisabled(inputGroup: Number): Boolean
    fun setControlNormal(inputGroup: Number, control: Number, amount: Number): Boolean
    fun setInputExclusive(inputGroup: Number, control: Number)
    fun setPadShake(p0: Number, duration: Number, frequency: Number)
    fun setPlayerpadShakesWhenControllerDisabled(toggle: Boolean)
    fun stopPadShake(p0: Any)
}

external interface MpGameCutscene {
    fun setCutscenePedPropVariation(cutsceneEntName: String, p1: Number, p2: Number, p3: Number, modelHash: Number)
    fun getEntityIndexOfCutsceneEntity(cutsceneEntName: String, modelHash: Number): MpEntity
    fun startCutscene(p0: Number)
    fun startCutsceneAtCoords(x: Number, y: Number, z: Number, p3: Number)
    fun hasThisCutsceneLoaded(cutsceneName: String): Boolean
    fun doesCutsceneEntityExist(cutsceneEntName: String, modelHash: Number): Boolean
    fun canSetExitStateForRegisteredEntity(cutsceneEntName: String, modelHash: Number): Boolean
    fun canSetEnterForRegisteredEntity(cutsceneEntName: String, modelHash: Number): Boolean
    fun requestCutscene(cutsceneName: String, p1: Number)
    fun setCutsceneFadeValues(p0: Boolean, p1: Boolean, p2: Boolean, p3: Boolean)
    fun setCutsceneTriggerArea(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number)
    fun canSetExitStateForCamera(p0: Boolean): Boolean
    fun setCutsceneOrigin(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any)
    fun setCutscenePedComponentVariation(cutsceneEntName: String, p1: Number, p2: Number, p3: Number, modelHash: Number)
    fun getEntityIndexOfRegisteredEntity(cutsceneEntName: String, modelHash: Number): MpEntity
    fun requestCutscene2(cutsceneName: String, p1: Number, p2: Number)
    fun stopCutscene(p0: Boolean)
    fun registerEntityForCutscene(cutscenePed: Number, cutsceneEntName: String, p2: Number, modelHash: Number, p4: Number)
}

external interface MpGameDatafile {
    fun arrayValueAddBoolean(arrayData: Any, value: Boolean)
    fun arrayValueAddNumber(arrayData: Any, value: Number)
    fun arrayValueAddInteger(arrayData: Any, value: Number)
    fun arrayValueAddObject(arrayData: Any)
    fun arrayValueAddString(arrayData: Any, value: String)
    fun arrayValueAddVector3(arrayData: Any, valueX: Number, valueY: Number, valueZ: Number)
    fun arrayValueGetBoolean(arrayData: Any, arrayIndex: Number): Boolean
    fun arrayValueGetNumber(arrayData: Any, arrayIndex: Number): Number
    fun arrayValueGetInteger(arrayData: Any, arrayIndex: Number): Number
    fun arrayValueGetObject(arrayData: Any, arrayIndex: Number): Any
    fun arrayValueGetSize(arrayData: Any): Number
    fun arrayValueGetString(arrayData: Any, arrayIndex: Number): String
    fun arrayValueGetType(arrayData: Any, arrayIndex: Number): Number
    fun arrayValueGetVector3(arrayData: Any, arraayIndex: Number): MpVector3
    fun loadUgcFile(filename: String): Boolean
    fun objectValueAddArray(objectData: Any, key: String)
    fun objectValueAddBoolean(arrayData: Any, key: String, value: Boolean)
    fun objectValueAddNumber(objectData: Any, key: String, value: Number)
    fun objectValueAddInteger(objectData: Any, key: String, value: Number)
    fun objectValueAddObject(objectData: Any, key: String)
    fun objectValueAddString(objectData: Any, key: String, value: String)
    fun objectValueAddVector3(objectData: Any, key: String, valueX: Number, valueY: Number, valueZ: Number)
    fun objectValueGetArray(objectData: Any, key: String): Any
    fun objectValueGetBoolean(objectData: Any, key: String): Boolean
    fun objectValueGetNumber(objectData: Any, key: String): Number
    fun objectValueGetInteger(objectData: Any, key: String): Number
    fun objectValueGetObject(objectData: Any, key: String)
    fun objectValueGetString(objectData: Any, key: String): String
    fun objectValueGetType(objectData: Any, key: String): Number
    fun objectValueGetVector3(objectData: Any, key: String): MpVector3
}

external interface MpGameDecisionevent {
    fun addShockingEventAtPosition(type: Number, x: Number, y: Number, z: Number, duration: Number): MpGameScript
    fun addShockingEventForEntity(type: Number, entity: Number, duration: Number): MpGameScript
    fun blockDecisionMakerEvent(name: Number, type: Number)
    fun clearDecisionMakerEventResponse(name: Number, type: Number)
    fun isShockingEventInSphere(type: Number, x: Number, y: Number, z: Number, radius: Number): Boolean
    fun removeAllShockingEvents(p0: Boolean)
    fun removeShockingEvent(event: MpGameScript): Boolean
    fun suppressShockingEvent(type: Number)
    fun unblockDecisionMakerEvent(name: Number, type: Number)
}

external interface MpGameDecorator {
    fun decorIsRegisteredAsType(propertyName: String, type: Number): Boolean
    fun decorRegister(propertyName: String, type: Number)
}

external interface MpGameDlc1 {
    fun getDlcVehicleData(dlcVehicleIndex: Number, outData: Any): Boolean
    fun getDlcVehicleFlags(p0: Number): Number
    fun getDlcVehicleModel(dlcVehicleIndex: Number): Number
    fun getDlcWeaponComponentData(p0: Any, p1: Any, componentDataPtr: MpWeaponComponentDataPointer): Boolean
    fun getDlcWeaponData(dlcWeaponIndex: Number, outData: MpWeaponDataPointer): Boolean
    fun getForcedComponent(componentHash: Number, componentId: Number, p2: Any, p3: Any, p4: Any)
    fun getNumDlcWeaponComponents(dlcWeaponIndex: Number): Number
    fun getNumForcedComponents(componentHash: Number): Number
    fun getNumPropsFromOutfit(p0: Number, p1: Number, p2: Number, p3: Boolean, p4: Number, componentId: Number): Number
    fun getPropFromOutfit(outfit: Any, slot: Number, item: Any): Boolean
    fun getShopPedComponent(p0: Any, p1: Any)
    fun getShopPedOutfit(p0: Any, p1: Any)
    fun getShopPedQueryComponent(componentId: Number, outComponent: Number): Number
    fun getShopPedQueryOutput(p0: Any, outfit: MpShopPedOutfit)
    fun getShopPedQueryProp(p0: Any, p1: Any)
    fun getVariantComponent(componentHash: Number, componentId: Number, p2: Any, p3: Any, p4: Any)
    fun initShopPedComponent(outComponent: Number): Number
    fun initShopPedProp(outProp: Number): Number
    fun isDlcDataEmpty(dlcData: Number): Boolean
}

external interface MpGameDlc2 {
    fun isDlcPresent(dlcHash: Number): Boolean
    fun nullify(variable: Any, unused: Any): Boolean
}

external interface MpGameEntity {
    fun createForcedObject(x: Number, y: Number, z: Number, p3: Any, modelHash: Number, p5: Boolean)
    fun createModelHide(x: Number, y: Number, z: Number, radius: Number, model: Number, p5: Boolean)
    fun createModelHideExcludingScriptObjects(x: Number, y: Number, z: Number, radius: Number, model: Number, p5: Boolean)
    fun createModelSwap(x: Number, y: Number, z: Number, radius: Number, originalModel: Number, newModel: Number, p6: Boolean)
    fun findAnimEventPhase(animDictionary: String, animName: String, p2: String, p3: Any, p4: Any): Boolean
    fun getEntityAnimDuration(animDict: String, animName: String): Number
    fun isAnEntity(handle: Number): Boolean
    fun playSynchronizedMapEntityAnim(p0: Number, p1: Number, p2: Number, p3: Number, p4: Any, p5: Any, p6: Any, p7: Any, p8: Number, p9: Number, p10: Any, p11: Number): Boolean
    fun removeForcedObject(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any)
    fun removeModelHide(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any)
    fun removeModelSwap(x: Number, y: Number, z: Number, radius: Number, originModel: Number, newModel: Number, p6: Boolean)
    fun setObjectAsNoLongerNeeded(`object`: Number)
    fun stopSynchronizedMapEntityAnim(p0: Number, p1: Number, p2: Number, p3: Number, p4: Any, p5: Number): Boolean
    fun wouldEntityBeOccluded(hash: Number, x: Number, y: Number, z: Number, p4: Boolean): Boolean
}

external interface MpGameFireMp {
    fun addSpecfxExplosion(x: Number, y: Number, z: Number, explosionType: Number, explosionFx: Number, damageScale: Number, isAudible: Boolean, isInvisible: Boolean, cameraShake: Number)
    fun getClosestFirePos(outPosition: MpVector3, x: Number, y: Number, z: Number): MpVector3
    fun getNumberOfFiresInRange(x: Number, y: Number, z: Number, radius: Number): Number
    fun getPedInsideExplosionArea(explosionType: Number, x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, radius: Number): MpEntity
    fun isExplosionInAngledArea(explosionType: Number, x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, angle: Number): Boolean
    fun isExplosionInArea(explosionType: Number, x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number): Boolean
    fun isExplosionInSphere(explosionType: Number, x: Number, y: Number, z: Number, radius: Number): Boolean
    fun removeScriptFire(fireHandle: Number)
    fun startScriptFire(x: Number, y: Number, z: Number, maxChildren: Number, isGasFire: Boolean): Number
    fun stopFireInRange(x: Number, y: Number, z: Number, radius: Number)
}

external interface MpGameGameplay {
    fun absf(value: Number): Number
    fun absi(value: Number): Number
    fun acos(p0: Number): Number
    fun addHospitalRestart(x: Number, y: Number, z: Number, p3: Number, p4: Any): Number
    fun addPoliceRestart(p0: Number, p1: Number, p2: Number, p3: Number, p4: Any)
    fun addStuntJump(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Number, p9: Number, p10: Number, p11: Number, p12: Number, p13: Number, p14: Number, p15: Any, p16: Any): Number
    fun addStuntJumpAngled(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Number, p9: Number, p10: Number, p11: Number, p12: Number, p13: Number, p14: Number, p15: Number, p16: Number, p17: Any, p18: Any): Number
    fun areStringsEqual(string1: String, string2: String): Boolean
    fun asin(p0: Number): Number
    fun atan(p0: Number): Number
    fun atan2(p0: Number, p1: Number): Number
    fun beginReplayStats(p0: Any, p1: Any)
    fun clearAngledAreaOfVehicles(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Boolean, p8: Boolean, p9: Boolean, p10: Boolean, p11: Boolean)
    fun clearArea(X: Number, Y: Number, Z: Number, radius: Number, p4: Boolean, ignoreCopCars: Boolean, ignoreObjects: Boolean, p7: Boolean)
    fun clearAreaOfCops(x: Number, y: Number, z: Number, radius: Number, flags: Number)
    fun clearAreaOfEverything(x: Number, y: Number, z: Number, radius: Number, p4: Boolean, p5: Boolean, p6: Boolean, p7: Boolean)
    fun clearAreaOfObjects(x: Number, y: Number, z: Number, radius: Number, flags: Number)
    fun clearAreaOfPeds(x: Number, y: Number, z: Number, radius: Number, flags: Number)
    fun clearAreaOfProjectiles(x: Number, y: Number, z: Number, radius: Number, flags: Number)
    fun clearAreaOfVehicles(x: Number, y: Number, z: Number, radius: Number, p4: Boolean, p5: Boolean, p6: Boolean, p7: Boolean, p8: Boolean)
    fun clearBit(address: Number, offset: Number): Number
    fun compareStrings(str1: String, str2: String, matchCase: Boolean, maxLength: Number): Number
    fun createIncident(p0: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, outIncident: Number): Number
    fun createIncidentWithEntity(p0: Number, p1: MpEntity, p2: Number, p3: Number, outIncident: Number): Number
    fun deleteIncident(incidentId: Number): Number
    fun deleteStuntJump(p0: Number)
    fun disableAutomaticRespawn(disableRespawn: Boolean)
    fun disableHospitalRestart(hospitalIndex: Number, toggle: Boolean)
    fun disablePoliceRestart(policeIndex: Number, toggle: Boolean)
    fun disableStuntJumpSet(p0: Number)
    fun displayOnscreenKeyboard(p0: Number, windowTitle: String, p2: String, defaultText: String, defaultConcat1: String, defaultConcat2: String, defaultConcat3: String, maxInputLength: Number)
    fun enableDispatchService(dispatchType: Number, toggle: Boolean)
    fun enableMpDlcMaps(toggle: Boolean)
    fun enableStuntJumpSet(p0: Number)
    fun findSpawnPointInDirection(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, distance: Number, spawnPoint: MpVector3): MpVector3
    fun getAngleBetween2dVectors(x1: Number, y1: Number, x2: Number, y2: Number): Number
    fun getBitsInRange(vars: Number, rangeStart: Number, rangeEnd: Number): Number
    fun getDistanceBetweenCoords(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, useZ: Boolean): Number
    fun getFreeStackSlotsCount(stackSize: Number): Number
    fun getGroundZFor3dCoord(x: Number, y: Number, z: Number, groundZ: Number, unk: Boolean): Number
    fun getHashKey(value: String): Number
    fun getHeadingFromVector2d(dx: Number, dy: Number): Number
    fun getModelDimensions(modelHash: Number, minimum: MpVector3, maximum: MpVector3): MpVector2
    fun getProfileSetting(profileSetting: Number): Number
    fun getRandomNumberInRange(startRange: Number, endRange: Number): Number
    fun getRandomIntInRange(startRange: Number, endRange: Number): Number
    fun getWeatherTypeTransition(p0: Any, p1: Any, progress_or_time: Number): Number
    fun hasBulletImpactedInArea(p0: Number, p1: Number, p2: Number, p3: Number, p4: Boolean, p5: Boolean): Boolean
    fun hasBulletImpactedInBox(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Boolean, p7: Boolean): Boolean
    fun hasButtonCombinationJustBeenEntered(hash: Number, amount: Number): Boolean
    fun hasCheatStringJustBeenEntered(hash: Number): Boolean
    fun ignoreNextRestart(toggle: Boolean)
    fun isAreaOccupied(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Boolean, p7: Boolean, p8: Boolean, p9: Boolean, p10: Boolean, p11: Any, p12: Boolean): Boolean
    fun isBitSet(address: Number, offset: Number): Boolean
    fun isBulletInAngledArea(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Boolean): Boolean
    fun isBulletInArea(p0: Number, p1: Number, p2: Number, p3: Number, p4: Boolean): Boolean
    fun isBulletInBox(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Boolean): Boolean
    fun isIncidentValid(incidentId: Number): Number
    fun isNextWeatherType(weatherType: String): Boolean
    fun isPointObscuredByAMissionEntity(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Any): Boolean
    fun isPositionOccupied(p0: Number, p1: Number, p2: Number, p3: Number, p4: Boolean, p5: Boolean, p6: Boolean, p7: Boolean, p8: Boolean, p9: Any, p10: Boolean): Boolean
    fun isPrevWeatherType(weatherType: String): Boolean
    fun isProjectileInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, ownedByPlayer: Boolean): Boolean
    fun isProjectileTypeInAngledArea(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Any, p8: Boolean): Boolean
    fun isProjectileTypeInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, type: Number, p7: Boolean): Boolean
    fun isSniperBulletInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number): Boolean
    fun isStringNull(string: String): Boolean
    fun isStringNullOrEmpty(string: String): Boolean
    fun overrideSaveHouse(p0: Boolean, p1: Number, p2: Number, p3: Number, p4: Number, p5: Boolean, p6: Number, p7: Number): Boolean
    fun registerBoolToSave(p0: Any, name: String)
    fun registerEnumToSave(p0: Any, name: String)
    fun registerNumberToSave(p0: Any, name: String)
    fun registerIntToSave(p0: Any, name: String)
    fun registerSaveHouse(p0: Number, p1: Number, p2: Number, p3: Number, p4: Any, p5: Any, p6: Any)
    fun registerTextLabelToSave(p0: Any, name: String)
    fun removeDispatchSpawnBlockingArea(p0: Any)
    fun setBit(address: Number, offset: Number): Number
    fun setBitsInRange(vars: Number, rangeStart: Number, rangeEnd: Number, p3: Number): Number
    fun setCloudHatTransition(type: String, transitionTime: Number)
    fun setCreditsActive(toggle: Boolean)
    fun setDispatchIdealSpawnDistance(p0: Number)
    fun setDispatchTimeBetweenSpawnAttempts(p0: Any, p1: Number)
    fun setDispatchTimeBetweenSpawnAttemptsMultiplier(p0: Any, p1: Number)
    fun setExplosiveAmmoThisFrame()
    fun setExplosiveMeleeThisFrame()
    fun setFadeInAfterDeathArrest(toggle: Boolean)
    fun setFadeInAfterLoad(toggle: Boolean)
    fun setFadeOutAfterArrest(toggle: Boolean)
    fun setFadeOutAfterDeath(toggle: Boolean)
    fun setFakeWantedLevel(fakeWantedLevel: Number)
    fun setFireAmmoThisFrame()
    fun setGamePaused(toggle: Boolean)
    fun setGravityLevel(level: Number)
    fun setMinigameInProgress(toggle: Boolean)
    fun setMissionFlag(toggle: Boolean)
    fun setOverrideWeather(weatherType: String)
    fun setRainFxIntensity(intensity: Number)
    fun setRandomEventFlag(p0: Boolean)
    fun setRandomSeed(time: Number)
    fun setSaveHouse(p0: Any, p1: Boolean, p2: Boolean)
    fun setSaveMenuActive(unk: Boolean)
    fun setSuperJumpThisFrame()
    fun setThisScriptCanBePaused(toggle: Boolean)
    fun setThisScriptCanRemoveBlipsCreatedByAnyScript(toggle: Boolean)
    fun setTimeScale(time: Number)
    fun setUnkMapFlag(flag: Number)
    fun setWeatherTypeNow(weatherType: String)
    fun setWeatherTypeNowPersist(weatherType: String)
    fun setWeatherTypeOverTime(weatherType: String, time: Number)
    fun setWeatherTypePersist(weatherType: String)
    fun setWeatherTypeTransition(sourceWeather: Number, targetWeather: Number, transitionTime: Number)
    fun setWind(p0: Number)
    fun setWindDirection(direction: Number)
    fun setWindSpeed(speed: Number)
    fun shootSingleBulletBetweenCoords(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, damage: Number, p7: Boolean, weaponHash: Number, ownerPed: Number, isAudible: Boolean, isInvisible: Boolean, speed: Number)
    fun startSaveArray(p0: Any, p1: Number, arrayName: String)
    fun startSaveData(p0: Any, p1: Any, p2: Boolean)
    fun startSaveStruct(p0: Any, p1: Number, structName: String)
    fun stringToInt(string: String, outInteger: Number): Number
    fun tan(p0: Number): Number
    fun terminateAllScriptsWithThisName(scriptName: String)
    fun usingMissionCreator(toggle: Boolean)
}

external interface MpGameGraphics {
    fun addDecal(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Number, p9: Number, p10: Number, p11: Number, p12: Number, p13: Number, p14: Number, p15: Number, p16: Number, p17: Boolean, p18: Boolean, p19: Boolean): Number
    fun addPetrolDecal(x: Number, y: Number, z: Number, groundLvl: Number, width: Number, transparency: Number)
    fun beginTextComponent(componentType: String)
    fun callScaleformMovieFunctionNumberParams(scaleform: Number, functionName: String, param1: Number, param2: Number, param3: Number, param4: Number, param5: Number)
    fun callScaleformMovieFunctionMixedParams(scaleform: Number, functionName: String, NumberParam1: Number, NumberParam2: Number, NumberParam3: Number, NumberParam4: Number, NumberParam5: Number, stringParam1: String, stringParam2: String, stringParam3: String, stringParam4: String, stringParam5: String)
    fun callScaleformMovieFunctionStringParams(scaleform: Number, functionName: String, param1: String, param2: String, param3: String, param4: String, param5: String)
    fun callScaleformMovieMethod(scaleform: Number, method: String)
    fun createCheckpoint(type: Number, posX1: Number, posY1: Number, posZ1: Number, posX2: Number, posY2: Number, posZ2: Number, radius: Number, colorR: Number, colorG: Number, colorB: Number, alpha: Number, reserved: Number): Number
    fun destroyTrackedPoint(point: Number)
    fun disableVehicleDistantlights(toggle: Boolean)
    fun doesParticleFxLoopedExist(ptfxHandle: Number): Boolean
    fun drawBox(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun drawDebugBox(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun drawDebugCross(x: Number, y: Number, z: Number, size: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun drawDebugLine(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun drawDebugLineWithTwoColours(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, r1: Number, g1: Number, b1: Number, r2: Number, g2: Number, b2: Number, alpha1: Number, alpha2: Number)
    fun drawDebugSphere(x: Number, y: Number, z: Number, radius: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun drawDebugText(text: String, x: Number, y: Number, z: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun drawDebugText2d(text: String, x: Number, y: Number, z: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun drawLightWithRange(posX: Number, posY: Number, posZ: Number, colorR: Number, colorG: Number, colorB: Number, range: Number, intensity: Number)
    fun drawLightWithRangeAndShadow(x: Number, y: Number, z: Number, r: Number, g: Number, b: Number, range: Number, intensity: Number, shadow: Number)
    fun drawLine(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun drawMarker(type: Number, posX: Number, posY: Number, posZ: Number, dirX: Number, dirY: Number, dirZ: Number, rotX: Number, rotY: Number, rotZ: Number, scaleX: Number, scaleY: Number, scaleZ: Number, colorR: Number, colorG: Number, colorB: Number, alpha: Number, bobUpAndDown: Boolean, faceCamera: Boolean, p19: Number, rotate: Boolean, textureDict: String, textureName: String, drawOnEnts: Boolean)
    fun drawPoly(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, x3: Number, y3: Number, z3: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun drawRect(x: Number, y: Number, width: Number, height: Number, r: Number, g: Number, b: Number, a: Number)
    fun drawScaleformMovie(scaleformHandle: Number, x: Number, y: Number, width: Number, height: Number, red: Number, green: Number, blue: Number, alpha: Number, p9: Number)
    fun drawScaleformMovie3d(scaleform: Number, posX: Number, posY: Number, posZ: Number, rotX: Number, rotY: Number, rotZ: Number, p7: Number, p8: Number, p9: Number, scaleX: Number, scaleY: Number, scaleZ: Number, p13: Any)
    fun drawScaleformMovie3dNonAdditive(scaleform: Number, posX: Number, posY: Number, posZ: Number, rotX: Number, rotY: Number, rotZ: Number, p7: Number, p8: Number, p9: Number, scaleX: Number, scaleY: Number, scaleZ: Number, p13: Any)
    fun drawScaleformMovieFullscreen(scaleform: Number, red: Number, green: Number, blue: Number, alpha: Number, unk: Boolean)
    fun drawScaleformMovieFullscreenMasked(scaleform1: Number, scaleform2: Number, red: Number, green: Number, blue: Number, alpha: Number)
    fun drawSpotLight(posX: Number, posY: Number, posZ: Number, dirX: Number, dirY: Number, dirZ: Number, colorR: Number, colorG: Number, colorB: Number, distance: Number, brightness: Number, roundness: Number, radius: Number, falloff: Number)
    fun drawSpotLightWithShadow(posX: Number, posY: Number, posZ: Number, dirX: Number, dirY: Number, dirZ: Number, colorR: Number, colorG: Number, colorB: Number, distance: Number, brightness: Number, roundness: Number, radius: Number, falloff: Number, shadow: Number)
    fun drawSprite(textureDict: String, textureName: String, screenX: Number, screenY: Number, scaleX: Number, scaleY: Number, heading: Number, colorR: Number, colorG: Number, colorB: Number, alpha: Number)
    fun drawText(text: String, position: MpVector3, data: MpFontData? = definedExternally)
    fun drawText(text: String, position: MpVector2, data: MpFontData? = definedExternally)
    fun drawTvChannel(xPos: Number, yPos: Number, xScale: Number, yScale: Number, rotation: Number, r: Number, g: Number, b: Number, alpha: Number)
    fun enableAlienBloodVfx(toggle: Boolean)
    fun enableClownBloodVfx(toggle: Boolean)
    fun enableMovieSubtitles(toggle: Boolean)
    fun fadeDecalsInRange(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any)
    fun getDecalWashLevel(decal: Number): Number
    fun getSafeZoneSize(): Number
    fun getScreenActiveResolution(x: Number, y: Number): MpVector2
    fun getScreenAspectRatio(b: Boolean): Number
    fun getScreenEffectIsActive(effectName: String): Number
    fun getScreenResolution(x: Number, y: Number): MpVector2
    fun getTextureResolution(textureDict: String, textureName: String): MpVector3
    fun hasHudScaleformLoaded(componentIndex: Int): Boolean
    fun hasNamedScaleformMovieLoaded(scaleformName: String): Boolean
    fun hasScaleformContainerMovieLoadedIntoParent(scaleformHandle: Number): Boolean
    fun hasScaleformMovieLoaded(scaleformHandle: Number): Boolean
    fun hasStreamedTextureDictLoaded(textureDict: String): Boolean
    fun isDecalAlive(decal: Number): Boolean
    fun isTrackedPointVisible(point: Number): Boolean
    fun loadMovieMeshSet(movieMeshSetName: String): Number
    fun loadTvChannel(tvChannel: Number): Boolean
    fun moveVehicleDecals(p0: Any, p1: Any)
    fun notify(text: String)
    fun pushScaleformMovieFunction(scaleform: Number, functionName: String): Boolean
    fun pushScaleformMovieFunctionFromHudComponent(componentIndex: Int , functionName: String): Boolean
    fun pushScaleformMovieFunctionN(functionName: String): Boolean
    fun pushScaleformMovieFunctionParameterBool(value: Boolean)
    fun pushScaleformMovieFunctionParameterNumber(value: Number)
    fun pushScaleformMovieFunctionParameterInt(value: Number)
    fun pushScaleformMovieFunctionParameterString(value: String)
    fun releaseMovieMeshSet(movieMeshSet: Number)
    fun removeDecal(decal: Number)
    fun removeDecalsFromObject(obj: Number)
    fun removeDecalsFromObjectFacing(obj: Number, x: Number, y: Number, z: Number)
    fun removeDecalsInRange(x: Number, y: Number, z: Number, range: Number)
    fun removeParticleFx(ptfxHandle: Number, p1: Boolean)
    fun removeParticleFxInRange(X: Number, Y: Number, Z: Number, radius: Number)
    fun requestHudScaleform(componentIndex: Int)
    fun requestScaleformMovie(scaleformName: String): Number
    fun requestScaleformMovie3(scaleformName: String): Number
    fun requestScaleformMovieInstance(scaleformName: String): Number
    fun requestStreamedTextureDict(textureDict: String, p1: Boolean)
    fun screen2dToWorld3d(x: Number, y: Number, useRaycast: Boolean? = definedExternally /* null */): MpVector3
    fun set2dLayer(layer: Number)
    fun setBlackout(enable: Boolean)
    fun setDebugLinesAndSpheresDrawingActive(enabled: Boolean)
    fun setDrawOrigin(x: Number, y: Number, z: Number, p3: Any)
    fun setFarShadowsSuppressed(toggle: Boolean)
    fun setFlash(p0: Number, p1: Number, fadeIn: Number, duration: Number, fadeOut: Number)
    fun setForcePedFootstepsTracks(toggle: Boolean)
    fun setForceVehicleTrails(toggle: Boolean)
    fun setFrozenRenderingDisabled(enabled: Boolean)
    fun setNightvision(toggle: Boolean)
    fun setNoiseoveride(toggle: Boolean)
    fun setNoisinessoveride(value: Number)
    fun setParticleFxBloodScale(p0: Boolean)
    fun setParticleFxCamInsideNonplayerVehicle(p0: Any, p1: Boolean)
    fun setParticleFxCamInsideVehicle(p0: Boolean)
    fun setParticleFxLoopedAlpha(ptfxHandle: Number, alpha: Number)
    fun setParticleFxLoopedColour(ptfxHandle: Number, r: Number, g: Number, b: Number, p4: Boolean)
    fun setParticleFxLoopedEvolution(ptfxHandle: Number, propertyName: String, amount: Number, Id: Boolean)
    fun setParticleFxLoopedOffsets(ptfxHandle: Number, x: Number, y: Number, z: Number, rotX: Number, rotY: Number, rotZ: Number)
    fun setParticleFxLoopedRange(ptfxHandle: Number, range: Number)
    fun setParticleFxLoopedScale(ptfxHandle: Number, scale: Number)
    fun setParticleFxNonLoopedAlpha(alpha: Number)
    fun setParticleFxNonLoopedColour(r: Number, g: Number, b: Number)
    fun setParticleFxShootoutBoat(p0: Any)
    fun setPtfxAssetNextCall(name: String)
    fun setPtfxAssetOldToNew(oldAsset: String, newAsset: String)
    fun setScaleformMovieAsNoLongerNeeded(scaleformHandle: Number): Number
    fun setScaleformMovieToUseSystemTime(scaleform: Number, toggle: Boolean)
    fun setScreenDrawPosition(x: Number, y: Number)
    fun setSeethrough(toggle: Boolean)
    fun setStreamedTextureDictAsNoLongerNeeded(textureDict: String)
    fun setTimecycleModifier(modifierName: String)
    fun setTimecycleModifierStrength(strength: Number)
    fun setTrackedPointInfo(point: Number, x: Number, y: Number, z: Number, radius: Number)
    fun setTransitionTimecycleModifier(modifierName: String, transition: Number)
    fun setTvAudioFrontend(toggle: Boolean)
    fun setTvChannel(channel: Number)
    fun setTvVolume(volume: Number)
    fun sittingTv(scaleform: Number): String
    fun startParticleFxLoopedAtCoord(effectName: String, x: Number, y: Number, z: Number, xRot: Number, yRot: Number, zRot: Number, scale: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean, p11: Boolean): Number
    fun startParticleFxLoopedOnEntity(effectName: String, entity: Number, xOffset: Number, yOffset: Number, zOffset: Number, xRot: Number, yRot: Number, zRot: Number, scale: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean): Number
    fun startParticleFxLoopedOnEntity2(effectName: String, entity: Number, xOffset: Number, yOffset: Number, zOffset: Number, xRot: Number, yRot: Number, zRot: Number, scale: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean): Number
    fun startParticleFxLoopedOnEntityBone(effectName: String, entity: Number, xOffset: Number, yOffset: Number, zOffset: Number, xRot: Number, yRot: Number, zRot: Number, boneIndex: Number, scale: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean): Number
    fun startParticleFxLoopedOnEntityBone2(effectName: String, entity: Number, xOffset: Number, yOffset: Number, zOffset: Number, xRot: Number, yRot: Number, zRot: Number, boneIndex: Number, scale: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean): Number
    fun startParticleFxLoopedOnPedBone(effectName: String, ped: Number, xOffset: Number, yOffset: Number, zOffset: Number, xRot: Number, yRot: Number, zRot: Number, boneIndex: Number, scale: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean): Number
    fun startParticleFxNonLoopedAtCoord(effectName: String, xPos: Number, yPos: Number, zPos: Number, xRot: Number, yRot: Number, zRot: Number, scale: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean): Boolean
    fun startParticleFxNonLoopedAtCoord2(effectName: String, xPos: Number, yPos: Number, zPos: Number, xRot: Number, yRot: Number, zRot: Number, scale: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean): Boolean
    fun startParticleFxNonLoopedOnEntity(effectName: String, entity: Number, offsetX: Number, offsetY: Number, offsetZ: Number, rotX: Number, rotY: Number, rotZ: Number, scale: Number, axisX: Boolean, axisY: Boolean, axisZ: Boolean): Boolean
    fun startParticleFxNonLoopedOnEntity2(effectName: String, entity: Number, xOffset: Number, yOffset: Number, zOffset: Number, xRot: Number, yRot: Number, zRot: Number, boneIndex: Number, scale: Number, xAxis: Boolean, yAxis: Boolean, zAxis: Boolean): Boolean
    fun startParticleFxNonLoopedOnPedBone(effectName: String, ped: Number, offsetX: Number, offsetY: Number, offsetZ: Number, rotX: Number, rotY: Number, rotZ: Number, boneIndex: Number, scale: Number, axisX: Boolean, axisY: Boolean, axisZ: Boolean): Boolean
    fun startParticleFxNonLoopedOnPedBone2(effectName: String, ped: Number, offsetX: Number, offsetY: Number, offsetZ: Number, rotX: Number, rotY: Number, rotZ: Number, boneIndex: Number, scale: Number, axisX: Boolean, axisY: Boolean, axisZ: Boolean): Boolean
    fun startScreenEffect(effectName: String, duration: Number, looped: Boolean)
    fun stopParticleFxLooped(ptfxHandle: Number, p1: Boolean)
    fun stopScreenEffect(effectName: String)
    fun transitionFromBlurred(transitionTime: Number): Boolean
    fun transitionToBlurred(transitionTime: Number): Boolean
    fun washDecalsInRange(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any)
    fun world3dToScreen2d(worldX: Number, worldY: Number, worldZ: Number, screenX: Number, screenY: Number): MpVector2
}

external interface MpGameInterior {
    fun addPickupToInteriorRoomByName(pickup: MpPickup, roomName: String)
    fun areCoordsCollidingWithExterior(x: Number, y: Number, z: Number): Boolean
    fun capInterior(interiorId: Number, toggle: Boolean)
    fun disableInterior(interiorId: Number, toggle: Boolean)
    fun disableInteriorProp(interiorId: Number, propName: String)
    fun enableInteriorProp(interiorId: Number, propName: String)
    fun getInteriorAtCoords(x: Number, y: Number, z: Number): Number
    fun getInteriorAtCoordsWithType(x: Number, y: Number, z: Number, interiorType: String): Number
    fun getInteriorFromCollision(x: Number, y: Number, z: Number): Number
    fun getInteriorGroupId(interiorId: Number): Number
    fun getOffsetFromInteriorInWorldCoords(interiorId: Number, x: Number, y: Number, z: Number): MpVector3
    fun hideMapObjectThisFrame(mapObjectHash: Number)
    fun hideMapObjectThisFrame(mapObjectHash: String)
    fun isInteriorCapped(interiorId: Number): Boolean
    fun isInteriorDisabled(interiorId: Number): Boolean
    fun isInteriorPropEnabled(interiorId: Number, propName: String): Boolean
    fun isInteriorReady(interiorId: Number): Boolean
    fun isValidInterior(interiorId: Number): Boolean
    fun refreshInterior(interiorId: Number)
    fun unkGetInteriorAtCoords(x: Number, y: Number, z: Number, unk: Number): Number
    fun unpinInterior(interiorId: Number)
}

external interface MpGameItemset {
    fun addToItemset(itemset: Number, p1: Any): Boolean
    fun cleanItemset(itemset: Number)
    fun createItemset(p0: Boolean): Number
    fun destroyItemset(itemset: Number)
    fun getIndexedItemInItemset(itemset: Number, p1: Any): Any
    fun getItemsetSize(itemset: Number): Number
    fun isInItemset(itemset: Number, p1: Any): Boolean
    fun isItemsetValid(itemset: Number): Boolean
    fun removeFromItemset(itemset: Number, p1: Any)
}

external interface MpGameMobile {
    fun cellCamActivate(p0: Boolean, p1: Boolean)
    fun createMobilePhone(phoneType: Number)
    fun getMobilePhonePosition(position: MpVector3): MpVector3
    fun getMobilePhoneRenderId(renderId: Number): Number
    fun getMobilePhoneRotation(rotation: MpVector3, p1: Any): MpVector3
    fun moveFinger(direction: Number)
    fun scriptIsMovingMobilePhoneOffscreen(toggle: Boolean)
    fun setMobilePhonePosition(posX: Number, posY: Number, posZ: Number)
    fun setMobilePhoneRotation(rotX: Number, rotY: Number, rotZ: Number, p3: Any)
    fun setMobilePhoneScale(scale: Number)
    fun setPhoneLean(toggle: Boolean)
}

external interface MpGameObject {
    fun addDoorToSystem(doorHash: Number, modelHash: Number, x: Number, y: Number, z: Number, p5: Number, p6: Number, p7: Number)
    fun createAmbientPickup(pickupHash: Number, posX: Number, posY: Number, posZ: Number, p4: Number, value: Number, modelHash: Number, p7: Boolean, p8: Boolean): MpPickup
    fun createMoneyPickups(x: Number, y: Number, z: Number, value: Number, amount: Number, model: Number)
    fun createObject(modelHash: Number, x: Number, y: Number, z: Number, networkHandle: Boolean, createHandle: Boolean, dynamic: Boolean): Number
    fun createObjectNoOffset(modelHash: Number, x: Number, y: Number, z: Number, networkHandle: Boolean, createHandle: Boolean, dynamic: Boolean): Number
    fun createPickup(pickupHash: Number, posX: Number, posY: Number, posZ: Number, p4: Number, value: Number, p6: Boolean, modelHash: Number): MpPickup
    fun createPickupRotate(pickupHash: Number, posX: Number, posY: Number, posZ: Number, rotX: Number, rotY: Number, rotZ: Number, flag: Number, amount: Number, p9: Any, p10: Boolean, modelHash: Number): MpPickup
    fun createPortablePickup(pickupHash: Number, x: Number, y: Number, z: Number, placeOnGround: Boolean, modelHash: Number): MpPickup
    fun createPortablePickup2(pickupHash: Number, x: Number, y: Number, z: Number, placeOnGround: Boolean, modelHash: Number): MpPickup
    fun deleteObject(`object`: Number): Number
    fun doesDoorExist(doorHash: Number): Boolean
    fun doesObjectOfTypeExistAtCoords(x: Number, y: Number, z: Number, radius: Number, hash: Number, p5: Boolean): Boolean
    fun doesPickupExist(p0: Any): Boolean
    fun doesPickupObjectExist(p0: Any): Boolean
    fun doorControl(doorHash: Number, x: Number, y: Number, z: Number, locked: Boolean, p5: Number, p6: Number, p7: Number)
    fun getClosestObjectOfType(x: Number, y: Number, z: Number, radius: Number, modelHash: Number, isMissing: Boolean, p6: Boolean, p7: Boolean): Number
    fun getObjectFragmentDamageHealth(p0: Any, p1: Boolean): Number
    fun getObjectOffsetFromCoords(xPos: Number, yPos: Number, zPos: Number, heading: Number, xOffset: Number, yOffset: Number, zOffset: Number): MpVector3
    fun getPickupCoords(p0: Any): Number
    fun getSafePickupCoords(x: Number, y: Number, z: Number, p3: Any, p4: Any): MpVector3
    fun getStateOfClosestDoorOfType(type: Number, x: Number, y: Number, z: Number, locked: Boolean, heading: Number): MpDoorState
    fun hasClosestObjectOfTypeBeenBroken(p0: Number, p1: Number, p2: Number, p3: Number, modelHash: Number, p5: Any): Boolean
    fun hasPickupBeenCollected(p0: Any): Boolean
    fun highlightPlacementCoords(x: Number, y: Number, z: Number, colorIndex: Number)
    fun isAnyObjectNearPoint(x: Number, y: Number, z: Number, range: Number, p4: Boolean): Boolean
    fun isDoorClosed(door: Number): Boolean
    fun isGarageEmpty(garage: Any, p1: Boolean, p2: Number): Boolean
    fun isObjectNearPoint(objectHash: Number, x: Number, y: Number, z: Number, range: Number): Boolean
    fun isPickupWithinRadius(pickupHash: Number, x: Number, y: Number, z: Number, radius: Number): Boolean
    fun isPointInAngledArea(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Number, p9: Number, p10: Boolean, p11: Boolean): Boolean
    fun removeAllPickupsOfType(p0: Any)
    fun removeDoorFromSystem(doorHash: Number)
    fun removePickup(pickup: MpPickup)
    fun setDoorAccelerationLimit(doorHash: Number, limit: Number, p2: Boolean, p3: Boolean)
    fun setDoorAjarAngle(doorHash: Number, ajar: Number, p2: Boolean, p3: Boolean)
    fun setForceObjectThisFrame(p0: Any, p1: Any, p2: Any, p3: Any)
    fun setPickupRegenerationTime(p0: Any, p1: Any)
    fun setStateOfClosestDoorOfType(type: Number, x: Number, y: Number, z: Number, locked: Boolean, heading: Number, p6: Boolean)
    fun setTeamPickupObject(p0: Any, p1: Any, p2: Any)
    fun trackObjectVisibility(p0: Any)
}

external interface MpGamePathfind {
    fun addNavmeshBlockingObject(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Boolean, p8: Any)
    fun addNavmeshRequiredRegion(p0: Number, p1: Number, p2: Number)
    fun calculateTravelDistanceBetweenPoints(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number): Number
    fun disableNavmeshInArea(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any)
    fun generateDirectionsToCoord(x: Number, y: Number, z: Number, p3: Any, p4: Number, vehicle: Number, p6: Number): MpDirections
    fun getClosestMajorVehicleNode(x: Number, y: Number, z: Number, outPosition: MpVector3, unknown1: Number, unknown2: Number): MpVector3
    fun getClosestRoad(x: Number, y: Number, z: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Number, p9: Number, p10: Boolean): Boolean
    fun getClosestVehicleNode(x: Number, y: Number, z: Number, outPosition: MpVector3, nodeType: Number, p5: Number, p6: Number): MpVector3
    fun getClosestVehicleNodeWithHeading(x: Number, y: Number, z: Number, outPosition: MpVector3, outHeading: Number, nodeType: Number, p6: Number, p7: Number): MpVehicleNode
    fun getIsSlowRoadFlag(nodeID: Number): Boolean
    fun getNthClosestVehicleNode(x: Number, y: Number, z: Number, nthClosest: Number, outPosition: MpVector3, unknown1: Any, unknown2: Any, unknown3: Any): MpVector3
    fun getNthClosestVehicleNodeFavourDirection(x: Number, y: Number, z: Number, desiredX: Number, desiredY: Number, desiredZ: Number, nthClosest: Number, outPosition: MpVector3, outHeading: Number, nodetype: Number, p10: Any, p11: Any): MpVehicleNode
    fun getNthClosestVehicleNodeId(x: Number, y: Number, z: Number, nth: Number, nodetype: Number, p5: Number, p6: Number): Number
    fun getNthClosestVehicleNodeIdWithHeading(x: Number, y: Number, z: Number, nthClosest: Number, outPosition: MpVector3, outHeading: Number, p6: Any, p7: Number, p8: Number): MpVector3
    fun getNthClosestVehicleNodeWithHeading(x: Number, y: Number, z: Number, nthClosest: Number, outPosition: MpVector3, heading: Number, unknown1: Any, unknown2: Number, unknown3: Number, unknown4: Number): MpVehicleNode2
    fun getRandomVehicleNode(x: Number, y: Number, z: Number, radius: Number, p4: Boolean, p5: Boolean, p6: Boolean, outPosition: MpVector3, heading: Number): MpVehicleNode
    fun getSafeCoordForPed(x: Number, y: Number, z: Number, onGround: Boolean, outPosition: MpVector3, flags: Number): MpVector3
    fun getStreetNameAtCoord(x: Number, y: Number, z: Number, streetName: Number, crossingRoad: Number): MpStreetName
    fun getSupportsGpsRouteFlag(nodeID: Number): Boolean
    fun getVehicleNodePosition(nodeId: Number, outPosition: MpVector3): MpVector3
    fun getVehicleNodeProperties(x: Number, y: Number, z: Number, density: Number, flags: Number): MpVehicleNodeProperties
    fun isNavmeshLoadedInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number): Boolean
    fun isPointOnRoad(x: Number, y: Number, z: Number, vehicle: Number): Boolean
    fun isVehicleNodeIdValid(vehicleNodeId: Number): Boolean
    fun loadAllPathNodes(keepInMemory: Boolean): Boolean
    fun removeNavmeshBlockingObject(p0: Any)
    fun setGpsDisabledZone(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any)
    fun setIgnoreNoGpsFlag(ignore: Boolean)
    fun setPedPathsBackToOriginal(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any)
    fun setPedPathsInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, unknown: Boolean)
    fun setRoadsBackToOriginal(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any)
    fun setRoadsBackToOriginalInAngledArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, p6: Number)
    fun setRoadsInAngledArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, angle: Number, unknown1: Boolean, unknown2: Boolean, unknown3: Boolean)
    fun setRoadsInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, unknown1: Boolean, unknown2: Boolean)
    fun updateNavmeshBlockingObject(p0: Any, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Any)
}

external interface MpGamePed {
    fun addRelationshipGroup(name: String, groupHash: Int): Int
    fun addScenarioBlockingArea(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Boolean, p7: Boolean, p8: Boolean, p9: Boolean): Any
    fun attachSynchronizedSceneToEntity(sceneId: Int, entity: MpEntity, boneIndex: Int)
    fun canCreateRandomPed(unk: Boolean): Boolean
    fun createGroup(unused: Int): Int
    fun createNmMessage(startImmediately: Boolean, messageId: Int)
    fun createPed(pedType: Int, modelHash: Int, x: Number, y: Number, z: Number, heading: Number, networkHandle: Boolean, pedHandle: Boolean): MpPed
    fun createRandomPed(x: Number, y: Number, z: Number): MpPed
    fun createSynchronizedScene(x: Number, y: Number, z: Number, roll: Number, pitch: Number, yaw: Number, p6: Int): Int
    fun clearPedAlternateWalkAnim(p0: Any, p1: Number)
    fun clearRelationshipBetweenGroups(relationship: Int, group1: Int, group2: Int)
    fun detachSynchronizedScene(sceneId: Int)
    fun disposeSynchronizedScene(scene: Int)
    fun doesGroupExist(groupId: Int): Boolean
    fun getAnimInitialOffsetPosition(animDict: String, animName: String, x: Number, y: Number, z: Number, xRot: Number, yRot: Number, zRot: Number, p8: Number, p9: Int): MpVector3
    fun getAnimInitialOffsetRotation(animDict: String, animName: String, x: Number, y: Number, z: Number, xRot: Number, yRot: Number, zRot: Number, p8: Number, p9: Int): MpVector3
    fun getClosestPed(x: Number, y: Number, z: Number, radius: Number, p4: Boolean, p5: Boolean, outPed: MpPed, p7: Boolean, p8: Boolean, pedType: Int): MpPed
    fun getFirstParentIdForPedType(type: Int): Int
    fun getGroupSize(groupId: Int, unknown: Any, sizeInMembers: Int): Any
    fun getNumHeadOverlayValues(overlayId: Int): Int
    fun getNumParentPedsOfType(type: Int): Int
    fun getPedAsGroupLeader(groupId: Int): MpPed
    fun getPedAsGroupLeader(groupId: Int, memberNumber: Int): MpPed
    fun getPedHeadshotTxdString(handle: Int): String
    fun getRandomPedAtCoord(x: Number, y: Number, z: Number, xRadius: Number, yRadius: Number, zRadius: Number, pedType: Int): MpPed
    fun getRelationshipBetweenGroups(group1: Int, group2: Int): Int
    fun getTattooZone(collection: Int, overlay: Int): Int
    fun getSynchronizedScenePhase(sceneId: Int): Number
    fun getSynchronizedSceneRate(sceneId: Int): Number
    fun hasActionModeAssetLoaded(asset: String): Boolean
    fun hasPedReceivedEvent(p0: Any, p1: Any): Boolean
    fun hasStealthModeAssetLoaded(asset: String): Boolean
    fun isAnyPedNearPoint(x: Number, y: Number, z: Number, radius: Number): Boolean
    fun isAnyPedShootingInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, p6: Boolean, p7: Boolean): Boolean
    fun isAValidBlushColor(colorId: Int): Boolean
    fun isAValidHairColor(colorId: Int): Boolean
    fun isAValidLipstickColor(colorId: Int): Boolean
    fun isCopPedInArea3d(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number): Boolean
    fun isPedheadshotReady(handle: Int): Boolean
    fun isPedheadshotValid(handle: Int): Boolean
    fun isPedRespondingToEvent(p0: Any, p1: Any): Boolean
    fun isSynchronizedSceneLooped(sceneId: Int): Boolean
    fun isSynchronizedSceneRunning(sceneId: Int): Boolean
    fun removeActionModeAsset(asset: String)
    fun removeGroup(groupId: Int)
    fun removeRelationshipGroup(groupHash: Int)
    fun removeScenarioBlockingArea(p0: Any, p1: Boolean)
    fun removeStealthModeAsset(asset: String)
    fun resetGroupFormationDefaultSpacing(groupHandle: Int)
    fun requestActionModeAsset(asset: String)
    fun requestStealthModeAsset(asset: String)
    fun setAiMeleeWeaponDamageModifier(modifier: Number)
    fun setAiWeaponDamageModifier(modifier: Number)
    fun setCreateRandomCops(toggle: Boolean)
    fun setCreateRandomCopsNotOnScenarios(toggle: Boolean)
    fun setCreateRandomCopsOnScenarios(toggle: Boolean)
    fun setGroupFormation(groupId: Int, formationType: Int)
    fun setGroupFormationSpacing(groupId: Int, p1: Number, p2: Number, p3: Number)
    fun setGroupSeparationRange(groupHandle: Int, separationRange: Number)
    fun setPedAlternateWalkAnim(p0: Any, p1: Any, p2: Any, p3: Number, p4: Boolean)
    fun setPedDensityMultiplierThisFrame(multiplier: Number)
    fun setPedNonCreationArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number)
    fun setPedToRagdollWithFall(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any, p7: Any, p8: Any, p9: Any, p10: Any, p11: Any, p12: Any, p13: Any): Boolean
    fun setPedReserveParachuteTintIndex(p0: Any, p1: Any)
    fun setRelationshipBetweenGroups(relationship: Int, group1: Int, group2: Int)
    fun setScenarioPedDensityMultiplierThisFrame(p0: Number, p1: Number)
    fun setScenarioPedsSpawnInSphereArea(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any)
    fun setScenarioPedsToBeReturnedByNextCommand(value: Boolean)
    fun setScriptedConversionCoordThisFrame(x: Number, y: Number, z: Number)
    fun setSynchronizedSceneLooped(sceneId: Int, toggle: Boolean)
    fun setSynchronizedSceneOrigin(sceneId: Int, x: Number, y: Number, z: Number, roll: Number, pitch: Number, yaw: Number, p7: Boolean)
    fun setSynchronizedScenePhase(sceneId: Int, phase: Number)
    fun setSynchronizedSceneRate(sceneId: Int, rate: Number)
    fun setTimeExclusiveDisplayTexture(p0: Any, p1: Boolean)
}

external interface MpGamePlayer {
    fun arePlayerFlashingStarsAboutToDrop(): Boolean
    fun arePlayerStarsGreyedOut(): Boolean
    fun canPlayerStartMission(): Boolean
    fun disablePlayerFiring(toggle: Boolean)
    fun disablePlayerVehicleRewards()
    fun displaySystemSigninUi(unk: Boolean)
    fun enableSpecialAbility(toggle: Boolean)
    fun forceCleanup(cleanupFlags: Number)
    fun forceCleanupForAllThreadsWithThisName(name: String, cleanupFlags: Number)
    fun forceCleanupForThreadWithThisId(id: Number, cleanupFlags: Number)
    fun getEntityPlayerIsFreeAimingAt(entity: Number): Boolean
    fun getPlayerTargetEntity(entity: Number): Boolean
    fun getTimeSincePlayerDroveAgainstTraffic(): Number
    fun getTimeSincePlayerDroveOnPavement(): Number
    fun getTimeSincePlayerHitPed(): Number
    fun getTimeSincePlayerHitVehicle(): Number
    fun getWantedLevelRadius(): Boolean
    fun getWantedLevelThreshold(wantedLevel: Number): Number
    fun giveAchievementToPlayer(achievement: Number): Boolean
    fun hasAchievementBeenPassed(achievement: Number): Boolean
    fun hasForceCleanupOccurred(cleanupFlags: Number): Boolean
    fun intToParticipantindex(value: Number): Number
    fun intToPlayerindex(value: Number): Number
    fun isPlayerFreeAimingAtEntity(entity: Number): Boolean
    fun isPlayerTargettingEntity(entity: Number): Boolean
    fun isSpecialAbilityActive(): Boolean
    fun isSpecialAbilityEnabled(): Boolean
    fun isSpecialAbilityMeterFull(): Boolean
    fun isSpecialAbilityUnlocked(playerModel: Number): Boolean
    fun playerAttachVirtualBound(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number)
    fun reportCrime(crimeType: Number, wantedLvlThresh: Number)
    fun reserveEntityExplodesOnHighExplosionCombo(p1: Number)
    fun resetWantedLevelDifficulty()
    fun restorePlayerStamina(p1: Number)
    fun setAirDragMultiplierForPlayersVehicle(multiplier: Number)
    fun setAllRandomPedsFlee(toggle: Boolean)
    fun setAllRandomPedsFleeThisFrame()
    fun setAreasGeneratorOrientation()
    fun setAutoGiveParachuteWhenEnterPlane(toggle: Boolean)
    fun setDisableAmbientMeleeMove(toggle: Boolean)
    fun setDispatchCopsForPlayer(toggle: Boolean)
    fun setHudAnimStopLevel(toggle: Boolean)
    fun setIgnoreLowPriorityShockingEvents(toggle: Boolean)
    fun setMaxWantedLevel(maxWantedLevel: Number)
    fun setMeleeWeaponDefenseModifier(modifier: Number)
    fun setPlayerClothLockCounter(value: Number)
    fun setPlayerClothPackageIndex(index: Number)
    fun setPlayerTargetingMode(targetMode: Number)
    fun setPoliceRadarBlips(toggle: Boolean)
    fun setRunSprintMultiplierForPlayer(multiplier: Number)
    fun setSpecialAbilityMultiplier(multiplier: Number)
    fun setSwimMultiplierForPlayer(multiplier: Number)
    fun setWantedLevelDifficulty(difficulty: Number)
    fun setWantedLevelMultiplier(multiplier: Number)
    fun simulatePlayerInputGait(amount: Number, gaitType: Number, speed: Number, p4: Boolean, p5: Boolean)
    fun specialAbilityChargeAbsolute(p1: Number, p2: Boolean)
    fun specialAbilityChargeContinuous(p1: Boolean)
    fun specialAbilityChargeLarge(p1: Boolean, p2: Boolean)
    fun specialAbilityChargeMedium(p1: Boolean, p2: Boolean)
    fun specialAbilityChargeNormalized(normalizedValue: Number, p2: Boolean)
    fun specialAbilityChargeSmall(p1: Boolean, p2: Boolean)
    fun specialAbilityDeactivate()
    fun specialAbilityDeactivateFast()
    fun specialAbilityDepleteMeter(p1: Boolean)
    fun specialAbilityFillMeter(p1: Boolean)
    fun specialAbilityLock(playerModel: Number)
    fun specialAbilityReset()
    fun specialAbilityUnlock(playerModel: Number)
    fun startFiringAmnesty(duration: Number)
    fun startPlayerTeleport(x: Number, y: Number, z: Number, heading: Number, p5: Boolean, p6: Boolean, p7: Boolean)
}

external interface MpGameRecorder {
    fun isRecording(): Boolean
    fun start(mode: Number)
    fun stop(save: Boolean)
}

external interface MpGameRope {
    fun addRope(x: Number, y: Number, z: Number, rotX: Number, rotY: Number, rotZ: Number, length: Number, ropeType: Number, maxLength: Number, minLength: Number, p10: Number, p11: Boolean, p12: Boolean, rigid: Boolean, p14: Number, breakWhenShot: Boolean, unkPtr: Any): Number
    fun applyImpulseToCloth(posX: Number, posY: Number, posZ: Number, vecX: Number, vecY: Number, vecZ: Number, impulse: Number)
    fun attachEntitiesToRope(rope: Number, ent1: Number, ent2: Number, ent1_x: Number, ent1_y: Number, ent1_z: Number, ent2_x: Number, ent2_y: Number, ent2_z: Number, length: Number, p10: Boolean, p11: Boolean, p12: Any, p13: Any)
    fun attachRopeToEntity(rope: Number, entity: Number, x: Number, y: Number, z: Number, p5: Boolean)
    fun breakEntityGlass(p0: Any, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Number, p9: Any, p10: Boolean)
    fun deleteChildRope(rope: Number): Any
    fun deleteRope(rope: Number)
    fun detachRopeFromEntity(rope: Number, entity: Number)
    fun doesRopeExist(rope: Number): Number
    fun getCgoffset(rope: Number): MpVector3
    fun getRopeLastVertexCoord(rope: Number)
    fun getRopeLength(rope: Number): Number
    fun getRopeVertexCoord(rope: Number, vertex: Number): Any
    fun getRopeVertexCount(rope: Number): Number
    fun loadRopeData(rope: Number, rope_preset: String): Any
    fun pinRopeVertex(rope: Number, vertex: Number, x: Number, y: Number, z: Number)
    fun ropeConvertToSimple(rope: Number)
    fun ropeDrawShadowEnabled(rope: Number, toggle: Boolean): Number
    fun ropeForceLength(rope: Number, length: Number): Any
    fun ropeResetLength(rope: Number, length: Boolean): Any
    fun ropeSetUpdatePinverts(rope: Number)
    fun setCgAtBoundcenter(rope: Number)
    fun setCgoffset(rope: Number, x: Number, y: Number, z: Number)
    fun setDamping(rope: Number, vertex: Number, value: Number)
    fun setDisableBreaking(rope: Number, enabled: Boolean)
    fun setDisableFragDamage(`object`: Number, toggle: Boolean)
    fun startRopeUnwindingFront(rope: Number)
    fun startRopeWinding(rope: Number)
    fun stopRopeUnwindingFront(rope: Number)
    fun stopRopeWinding(rope: Number)
    fun unpinRopeVertex(rope: Number, vertex: Number): Any
}

external interface MpGameScript {
    fun doesScriptExist(scriptName: String): Boolean
    fun getEventAtIndex(p0: Number, eventIndex: Number): Number
    fun getEventdata(p0: Number, eventIndex: Number, eventData: Number, p3: Number): Number
    fun getEventExists(p0: Number, eventIndex: Number): Boolean
    fun getNumberOfEvents(p0: Number): Number
    fun getNumberOfInstancesOfStreamedScript(scriptHash: Number): Number
    fun getThreadName(threadId: Number): String
    fun hasScriptLoaded(scriptName: String): Boolean
    fun hasStreamedScriptLoaded(scriptHash: Number): Boolean
    fun isStreamedScriptRunning(scriptHash: Number): Boolean
    fun isThreadActive(threadId: Number): Boolean
    fun requestScript(scriptName: String)
    fun requestStreamedScript(scriptHash: Number)
    fun setNoLoadingScreen(toggle: Boolean)
    fun setScriptAsNoLongerNeeded(scriptName: String)
    fun setStreamedScriptAsNoLongerNeeded(scriptHash: Number)
    fun terminateThread(threadId: Number)
    fun triggerScriptEvent(p0: Number, argsStruct: MpVector3, argsStructSize: Number, bitset: Number): MpVector3
}

external interface MpGameStats {
    fun leaderboards2ReadByHandle(p0: Any, p1: Any): Boolean
    fun leaderboards2ReadByRadius(p0: Any, p1: Any, p2: Any): Boolean
    fun leaderboards2ReadByRank(p0: Any, p1: Any, p2: Any): Boolean
    fun leaderboards2ReadByRow(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any): Boolean
    fun leaderboards2ReadByScoreNumber(p0: Any, p1: Number, p2: Any): Boolean
    fun leaderboards2ReadByScoreInt(p0: Any, p1: Any, p2: Any): Boolean
    fun leaderboards2ReadFriendsByRow(p0: Any, p1: Any, p2: Any, p3: Boolean, p4: Any, p5: Any): Boolean
    fun leaderboards2WriteData(p0: Any): Boolean
    fun leaderboardsCacheDataRow(p0: Any): Boolean
    fun leaderboardsGetCacheDataRow(p0: Any, p1: Any, p2: Any): Boolean
    fun leaderboardsGetCacheExists(p0: Any): Boolean
    fun leaderboardsGetCacheTime(p0: Any): Any
    fun leaderboardsGetColumnId(p0: Any, p1: Any, p2: Any): Any
    fun leaderboardsGetColumnType(p0: Any, p1: Any, p2: Any): Any
    fun leaderboardsGetNumberOfColumns(p0: Any, p1: Any): Any
    fun leaderboardsReadClear(p0: Any, p1: Any, p2: Any): Any
    fun leaderboardsReadPending(p0: Any, p1: Any, p2: Any): Boolean
    fun leaderboardsReadSuccessful(p0: Any, p1: Any, p2: Any): Boolean
    fun playstatsAwardXp(p0: Any, p1: Any, p2: Any)
    fun playstatsCheatApplied(cheat: String)
    fun playstatsClothChange(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any)
    fun playstatsFriendActivity(p0: Any, p1: Any)
    fun playstatsMatchStarted(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any)
    fun playstatsMissionCheckpoint(p0: Any, p1: Any, p2: Any, p3: Any)
    fun playstatsMissionOver(p0: Any, p1: Any, p2: Any, p3: Boolean, p4: Boolean, p5: Boolean)
    fun playstatsMissionStarted(p0: Any, p1: Any, p2: Any, p3: Boolean)
    fun playstatsNpcInvite(p0: Any)
    fun playstatsOddjobDone(p0: Any, p1: Any, p2: Any)
    fun playstatsPropChange(p0: Any, p1: Any, p2: Any, p3: Any)
    fun playstatsRaceCheckpoint(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any)
    fun playstatsRankUp(p0: Any)
    fun playstatsShopItem(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any)
    fun playstatsWebsiteVisited(scaleformHash: Number, p1: Number)
    fun statClearSlotForReload(statSlot: Number): Any
    fun statDeleteSlot(p0: Any): Any
    fun statGetBool(statHash: Number, outValue: Boolean, p2: Any): Boolean
    fun statGetBoolMasked(statName: Number, mask: Number, p2: Number): Boolean
    fun statGetDate(statHash: Number, p1: Any, p2: Any, p3: Any): Boolean
    fun statGetNumber(statHash: Number, outValue: Number, p2: Any): Number
    fun statGetInt(statHash: Number, outValue: Number, p2: Number): Number
    fun statGetLicensePlate(statName: Number): String
    fun statGetMaskedInt(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any): Boolean
    fun statGetNumberOfDays(statName: Number): Number
    fun statGetNumberOfHours(statName: Number): Number
    fun statGetNumberOfMinutes(statName: Number): Number
    fun statGetNumberOfSeconds(statName: Number): Number
    fun statGetPos(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any): Boolean
    fun statGetString(statHash: Number, p1: Number): String
    fun statGetUserId(p0: Any): String
    fun statIncrement(statName: Number, value: Number)
    fun statLoad(p0: Number): Boolean
    fun statLoadPending(p0: Any): Boolean
    fun statSave(p0: Number, p1: Boolean, p2: Number): Boolean
    fun statSetBool(statName: Number, value: Boolean, save: Boolean): Boolean
    fun statSetBoolMasked(statName: Number, value: Boolean, mask: Number, save: Boolean): Boolean
    fun statSetCurrentPosixTime(statName: Number, p1: Boolean): Boolean
    fun statSetDate(statName: Number, value: MpDateTime, numFields: Number, save: Boolean)
    fun statSetNumber(statName: Number, value: Number, save: Boolean): Boolean
    fun statSetGxtLabel(statName: Number, value: String, save: Boolean): Boolean
    fun statSetInt(statName: Number, value: Number, save: Boolean): Boolean
    fun statSetLicensePlate(statName: Number, str: String): Boolean
    fun statSetMaskedInt(statName: Number, p1: Any, p2: Any, p3: Number, save: Boolean): Boolean
    fun statSetPos(statName: Number, x: Number, y: Number, z: Number, save: Boolean): Boolean
    fun statSetProfileSetting(profileSetting: Number, value: Number)
    fun statSetString(statName: Number, value: String, save: Boolean): Boolean
    fun statSetUserId(statName: Number, value: String, save: Boolean): Boolean
    fun statSlotIsLoaded(p0: Any): Boolean
}

external interface MpGameStreaming {
    fun doesAnimDictExist(animDict: String): Boolean
    fun getIdealPlayerSwitchType(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number): Number
    fun hasAnimDictLoaded(animDict: String): Boolean
    fun hasAnimSetLoaded(animSet: String): Boolean
    fun hasClipSetLoaded(clipSet: String): Boolean
    fun hasCollisionForModelLoaded(model: Number): Boolean
    fun hasModelLoaded(model: Number): Boolean
    fun hasNamedPtfxAssetLoaded(fxName: String): Boolean
    fun isIplActive(iplName: String): Boolean
    fun isModelAVehicle(model: Number): Boolean
    fun isModelInCdimage(model: Number): Boolean
    fun isModelValid(model: Number): Boolean
    fun loadScene(x: Number, y: Number, z: Number)
    fun newLoadSceneStart(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Any): Boolean
    fun newLoadSceneStartSafe(p0: Number, p1: Number, p2: Number, p3: Number, p4: Any): Boolean
    fun prefetchSrl(p0: Any)
    fun removeAnimDict(animDict: String)
    fun removeAnimSet(animSet: String)
    fun removeClipSet(clipSet: String)
    fun removeIpl(iplName: String)
    fun removeNamedPtfxAsset(fxName: String)
    fun requestAdditionalCollisionAtCoord(p0: Number, p1: Number, p2: Number)
    fun requestAnimDict(animDict: String)
    fun requestAnimSet(animSet: String)
    fun requestClipSet(clipSet: String)
    fun requestCollisionAtCoord(x: Number, y: Number, z: Number): Any
    fun requestCollisionForModel(model: Number)
    fun requestIpl(iplName: String)
    fun requestModel(model: Number, cb: Function<*>? = definedExternally /* null */)
    fun requestModel2(model: Number)
    fun requestNamedPtfxAsset(fxName: String)
    fun setDitchPoliceModels(toggle: Boolean)
    fun setFocusArea(x: Number, y: Number, z: Number, offsetX: Number, offsetY: Number, offsetZ: Number)
    fun setGamePausesForStreaming(toggle: Boolean)
    fun setHdArea(x: Number, y: Number, z: Number, ground: Number)
    fun setInteriorActive(interiorID: Number, toggle: Boolean)
    fun setModelAsNoLongerNeeded(model: Number)
    fun setPedPopulationBudget(p0: Number)
    fun setPlayerSwitchLocation(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number, p7: Number, p8: Any)
    fun setReducePedModelBudget(toggle: Boolean)
    fun setReduceVehicleModelBudget(toggle: Boolean)
    fun setSrlTime(p0: Number)
    fun setStreaming(toggle: Boolean)
    fun setUnkCameraSettings(x: Number, y: Number, z: Number, rad: Number, p4: Any, p5: Any): Any
    fun setVehiclePopulationBudget(p0: Number)
    fun startPlayerSwitch(from: Number, to: Number, flags: Number, switchType: Number)
}

external interface MpGameSystem {
    fun ceil(value: Number): Number
    fun cos(value: Number): Number
    fun floor(value: Number): Number
    fun pow(base: Number, exponent: Number): Number
    fun round(value: Number): Number
    fun settimera(value: Number)
    fun settimerb(value: Number)
    fun shiftLeft(value: Number, bitShift: Number): Number
    fun shiftRight(value: Number, bitShift: Number): Number
    fun sin(value: Number): Number
    fun sqrt(value: Number): Number
    fun startNewScript(scriptName: String, stackSize: Number): Number
    fun startNewScriptWithArgs(scriptName: String, args: Any, argCount: Number, stackSize: Number): Number
    fun startNewStreamedScript(scriptHash: Number, stackSize: Number): Number
    fun startNewStreamedScriptWithArgs(scriptHash: Number, args: Any, argCount: Number, stackSize: Number): Number
    fun toNumber(value: Number): Number
    fun vdist(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number): Number
    fun vdist2(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number): Number
    fun vmag(p0: Number, p1: Number, p2: Number): Number
    fun vmag2(p0: Number, p1: Number, p2: Number): Number
    fun wait(ms: Number)
}

external interface MpGameTime {
    fun addToClockTime(hour: Number, minute: Number, second: Number)
    fun advanceClockTimeTo(hour: Number, minute: Number, second: Number)
    fun getLocalTime(year: Number, month: Number, day: Number, hour: Number, minute: Number, second: Number): MpDateTime2
    fun getLocalTimeGmt(year: Number, month: Number, day: Number, hour: Number, minute: Number, second: Number): MpDateTime2
    fun getPosixTime(year: Number, month: Number, day: Number, hour: Number, minute: Number, second: Number): MpDateTime2
    fun pauseClock(toggle: Boolean)
    fun setClockDate(day: Number, month: Number, year: Number)
    fun setClockTime(hour: Number, minute: Number, second: Number)
}

external interface MpGameUi {
    fun activateFrontendMenu(menuhash: Number, Toggle_Pause: Boolean, p2: Number)
    fun addBlipForCoord(x: Number, y: Number, z: Number): MpBlip
    fun addBlipForPickup(pickup: MpPickup): MpBlip
    fun addBlipForRadius(posX: Number, posY: Number, posZ: Number, radius: Number): MpBlip
    fun addNextMessageToPreviousBriefs(p0: Boolean)
    fun addTextComponentNumber(value: Number, decimalPlaces: Number)
    fun addTextComponentInteger(value: Number)
    fun addTextComponentItemString(labelName: String)
    fun addTextComponentSubstringCash(cashAmount: Number, p1: Boolean)
    fun addTextComponentSubstringLocalized(gxtEntryHash: Number)
    fun addTextComponentSubstringPlayerName(text: String)
    fun addTextComponentSubstringTime(timestamp: Number, flags: Number)
    fun addTextComponentSubstringWebsite(website: String)
    fun addTrevorRandomModifier(headDisplayId: Number): Boolean
    fun beginTextCommandSetBlipName(gxtentry: String)
    fun clearAdditionalText(p0: Number, p1: Boolean)
    fun clearNumberingHelp(p0: Any, p1: Boolean)
    fun clearHelp(toggle: Boolean)
    fun clearThisPrint(p0: String)
    fun displayAmmoThisFrame(display: Boolean)
    fun displayAreaName(toggle: Boolean)
    fun displayCash(toggle: Boolean)
    fun displayHelpTextFromStringLabel(p0: Any, loop: Boolean, beep: Boolean, shape: Number)
    fun displayHelpTextThisFrame(message: String, p1: Boolean)
    fun displayHud(toggle: Boolean)
    fun displayRadar(Toggle: Boolean): Any
    fun doesTextBlockExist(gxt: String): Boolean
    fun doesTextLabelExist(gxt: String): Boolean
    fun drawNotification(blink: Boolean, p1: Boolean): Number
    fun drawNotification2(blink: Boolean, p1: Boolean): Number
    fun drawNotification3(blink: Boolean, p1: Boolean): Number
    fun drawNotification4(blink: Boolean, p1: Boolean): Number
    fun drawSubtitleTimed(time: Number, p1: Boolean)
    fun drawText(x: Number, y: Number)
    fun enableDeathbloodSeethrough(p0: Boolean)
    fun flashAbilityBar(p0: Any)
    fun flashWantedDisplay(p0: Boolean): Any
    fun getBlipInfoIdCoord(p0: Number): MpVector3
    fun getHudColour(hudIndex: Number, r: Number, g: Number, b: Number, a: Number): MpHudColor
    fun getHudComponentPosition(componentIndex: Int /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number */): Number
    fun getLabelText(labelName: String): String
    fun getLengthOfLiteralString(string: String): Number
    fun getLengthOfStringWithThisTextLabel(gxt: String): Number
    fun getNamedRendertargetRenderId(p0: String): Any
    fun getStreetNameFromHashKey(hash: Number): String
    fun getTextScaleHeight(size: Number, font: Number): Number
    fun getTextScreenWidth(p0: Boolean): Number
    fun getTextSubstring(text: String, position: Number, length: Number): String
    fun getTextSubstringSafe(text: String, position: Number, length: Number, maxLength: Number): String
    fun getTextSubstringSlice(text: String, startPosition: Number, endPosition: Number): String
    fun hasAdditionalTextLoaded(slot: Number): Boolean
    fun hasHeadDisplayLoaded(headDisplayId: Number): Boolean
    fun hasThisAdditionalTextLoaded(gxt: String, slot: Number): Boolean
    fun hideHudComponentThisFrame(componentIndex: Int /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number */)
    fun hideScriptedHudComponentThisFrame(componentIndex: Int /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number */)
    fun hideSpecialAbilityLockonOperation(p0: Any, p1: Boolean)
    fun isHudComponentActive(componentIndex: Int /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number */): Boolean
    fun isMinimapAreaRevealed(x: Number, y: Number, radius: Number): Boolean
    fun isNamedRendertargetLinked(hash: Number): Boolean
    fun isNamedRendertargetRegistered(p0: String): Boolean
    fun isPauseMenuActive(): Boolean
    fun isScriptedHudComponentActive(componentIndex: Int /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number */): Boolean
    fun isStreamingAdditionalText(p0: Number): Boolean
    fun keyHudColour(p0: Boolean, p1: Any)
    fun linkNamedRendertarget(hash: Number)
    fun lockMinimapAngle(angle: Number)
    fun lockMinimapPosition(x: Number, y: Number)
    fun objectDecalToggle(hash: Number)
    fun registerNamedRendertarget(p0: String, p1: Boolean): Boolean
    fun releaseNamedRendertarget(p0: Any): Boolean
    fun removeBlip(blip: Number)
    fun removeNotification(notifactionId: Number)
    fun requestAdditionalText(gxt: String, slot: Number)
    fun requestAdditionalText2(gxt: String, slot: Number)
    fun resetHudComponentValues(componentIndex: Int /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number */)
    fun respondingAsTemp(p0: Number)
    fun restartFrontendMenu(menuHash: Number, p1: Number)
    fun setAbilityBarValue(p0: Number, p1: Number)
    fun setCursorSprite(spriteId: Number)
    fun setFrontendActive(active: Boolean)
    fun setGpsFlags(p0: Number, p1: Number)
    fun setGpsFlashes(toggle: Boolean)
    fun setHeadDisplayFlag(headDisplayId: Number, sprite: Number, toggle: Boolean)
    fun setHeadDisplayString(headDisplayId: Number, string: String)
    fun setHeadDisplayWanted(headDisplayId: Number, wantedlvl: Number)
    fun setHudColour(componentIndex: Int /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number */, r: Number, g: Number, b: Number, a: Number)
    fun setHudComponentPosition(componentIndex: Int /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ | Number /* 11 */ | Number /* 12 */ | Number /* 13 */ | Number /* 14 */ | Number /* 15 */ | Number /* 16 */ | Number /* 17 */ | Number /* 18 */ | Number /* 19 */ | Number /* 20 */ | Number */, x: Number, y: Number)
    fun setLoadingPromptTextEntry(string: String)
    fun setMinimapAttitudeIndicatorLevel(altitude: Number, p1: Boolean)
    fun setMinimapBlockWaypoint(toggle: Boolean)
    fun setMinimapComponent(p0: Number, p1: Boolean, p2: Number): Any
    fun setMinimapRevealed(toggle: Boolean)
    fun setMinimapVisible(toggle: Boolean)
    fun setMissionName(p0: Boolean, name: String)
    fun setMultiplayerHudCash(p0: Number, p1: Number)
    fun setNewWaypoint(x: Number, y: Number)
    fun setNotificationFlashColor(red: Number, green: Number, blue: Number, alpha: Number)
    fun setNotificationMessage(picName1: String, picName2: String, flash: Boolean, iconType: Number, sender: String, subject: String): Number
    fun setNotificationMessageClanTag(picName1: String, picName2: String, flash: Boolean, iconType: Number, sender: String, subject: String, duration: Number, clanTag: String): Number
    fun setNotificationMessageClanTag2(picName1: String, picName2: String, flash: Boolean, iconType1: Number, sender: String, subject: String, duration: Number, clanTag: String, iconType2: Number, p9: Number): Number
    fun setNotificationTextEntry(type: String)
    fun setPauseMenuActive(toggle: Boolean)
    fun setPlayerBlipPositionThisFrame(x: Number, y: Number)
    fun setPlayerCashChange(cash: Number, bank: Number)
    fun setRadarAsInteriorThisFrame(interior: Number, x: Number, y: Number, z: Number, p4: Number)
    fun setRadarBigmapEnabled(toggleBigMap: Boolean, showFullMap: Boolean)
    fun setRadarZoom(zoomLevel: Number)
    fun setRadarZoomLevelThisFrame(zoomLevel: Number)
    fun setTextCentre(align: Boolean)
    fun setTextChatUnk(p0: Boolean)
    fun setTextColour(red: Number, green: Number, blue: Number, alpha: Number)
    fun setTextComponentFormat(inputType: String)
    fun setTextDropshadow(distance: Number, r: Number, g: Number, b: Number, a: Number)
    fun setTextEdge(p0: Number, r: Number, g: Number, b: Number, a: Number)
    fun setTextEntry(text: String)
    fun setTextEntry2(p0: String)
    fun setTextEntryForWidth(text: String)
    fun setTextFont(fontType: Number)
    fun setTextGxtEntry(entry: String)
    fun setTextJustification(justifyType: Number)
    fun setTextLeading(p0: Boolean)
    fun setTextProportional(p0: Boolean)
    fun setTextRenderId(renderId: Number)
    fun setTextRightJustify(toggle: Boolean)
    fun setTextScale(sizex: Number, sizey: Number)
    fun setTextWrap(start: Number, end: Number)
    fun setUseridsUihidden(p0: Any, p1: Any): Boolean
    fun setWarningMessage(entryLine1: String, instructionalKey: Number, entryLine2: String, p3: Boolean, p4: Any, p5: Any, p6: Any, background: Boolean)
    fun setWarningMessage2(entryHeader: String, entryLine1: String, instructionalKey: Number, entryLine2: String, p4: Boolean, p5: Any, p6: Any, p7: Any, background: Boolean)
    fun setWarningMessage3(entryHeader: String, entryLine1: String, instructionalKey: Any, entryLine2: String, p4: Any, p5: Any, p6: Any, p7: Any, p8: Any, p9: Boolean)
    fun setWidescreenFormat(p0: Any)
    fun showHudComponentThisFrame(componentIndex: Int)
    fun showLoadingPrompt(busySpinnerType: Number)
    fun showWeaponWheel(forcedShow: Boolean)
    fun toggleStealthRadar(toggle: Boolean)
}

external interface MpGameUnk {
    fun getBroadcastFinishedLosSound(p0: Boolean)
}

external interface MpGameVehicle {
    fun addVehicleStuckCheckWithWarp(p0: Any, p1: Number, p2: Any, p3: Boolean, p4: Boolean, p5: Boolean, p6: Any)
    fun createMissionTrain(variation: Number, x: Number, y: Number, z: Number, direction: Boolean): Number
    fun createScriptVehicleGenerator(x: Number, y: Number, z: Number, heading: Number, p4: Number, p5: Number, modelHash: Number, p7: Number, p8: Number, p9: Number, p10: Number, p11: Boolean, p12: Boolean, p13: Boolean, p14: Boolean, p15: Boolean, p16: Number): Number
    fun createVehicle(modelHash: Number, x: Number, y: Number, z: Number, heading: Number, networkHandle: Boolean, vehiclehandle: Boolean): Any
    fun deleteMissionTrain(train: Number): Number
    fun deleteScriptVehicleGenerator(vehicleGenerator: Number)
    fun disableVehicleWeapon(disabled: Boolean, weaponHash: Number, vehicle: Number, owner: Number)
    fun displayDistantVehicles(toggle: Boolean)
    fun doesScriptVehicleGeneratorExist(vehicleGenerator: Number): Boolean
    fun doesVehicleExistWithDecorator(decorator: String): Boolean
    fun getClosestVehicle(x: Number, y: Number, z: Number, radius: Number, modelHash: Number, flags: Number): Number
    fun getCurrentPlaybackForVehicle(p0: Any): Any
    fun getDisplayNameFromVehicleModel(modelHash: Number): String
    fun getNumModColors(p0: Number, p1: Boolean): Number
    fun getPositionInRecording(p0: Any): Number
    fun getPositionOfVehicleRecordingAtTime(p0: Any, p1: Number, p2: Any): Number
    fun getRandomVehicleBackBumperInSphere(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number): Number
    fun getRandomVehicleFrontBumperInSphere(p0: Number, p1: Number, p2: Number, p3: Number, p4: Number, p5: Number, p6: Number): Number
    fun getRandomVehicleInSphere(x: Number, y: Number, z: Number, radius: Number, modelHash: Number, flags: Number): Number
    fun getRandomVehicleModelInMemory(p0: Boolean, modelHash: Number, p2: Number): MpRandomVehicleModelInMemory
    fun getRotationOfVehicleRecordingAtTime(p0: Any, p1: Number, p2: Any): Number
    fun getTimePositionInRecording(p0: Any): Number
    fun getTotalDurationOfVehicleRecording(p0: Any, p1: Any): Any
    fun getTotalDurationOfVehicleRecordingId(p0: Any): Number
    fun getVehicleClassFromName(modelHash: Number): Number
    fun getVehicleClassMaxAcceleration(p0: Any): Number
    fun getVehicleClassMaxAgility(p0: Any): Number
    fun getVehicleClassMaxBraking(p0: Any): Number
    fun getVehicleClassMaxTraction(p0: Any): Number
    fun getVehicleModelAcceleration(modelHash: Number): Number
    fun getVehicleModelMaxBraking(modelHash: Number): Number
    fun getVehicleModelMaxNumberOfPassengers(modelHash: Number): Number
    fun getVehicleModelMaxSpeed(modelHash: Number): Number
    fun getVehicleModelMaxTraction(modelHash: Number): Number
    fun getVehicleRecordingId(p0: Any, p1: Any): Any
    fun hasPreloadModsFinished(p0: Any): Boolean
    fun hasVehicleAssetLoaded(vehicleAsset: Number): Boolean
    fun hasVehicleRecordingBeenLoaded(p0: Any, p1: Any): Boolean
    fun isAnyVehicleNearPoint(x: Number, y: Number, z: Number, radius: Number): Boolean
    fun isCopVehicleInArea3d(x1: Number, x2: Number, y1: Number, y2: Number, z1: Number, z2: Number): Boolean
    fun isPlaybackGoingOnForVehicle(p0: Any): Boolean
    fun isPlaybackUsingAiGoingOnForVehicle(p0: Any): Boolean
    fun isThisModelABicycle(model: Number): Boolean
    fun isThisModelABike(model: Number): Boolean
    fun isThisModelABoat(model: Number): Boolean
    fun isThisModelACar(model: Number): Boolean
    fun isThisModelAHeli(model: Number): Boolean
    fun isThisModelAnEmergencyBoat(model: Number): Boolean
    fun isThisModelAPlane(model: Number): Boolean
    fun isThisModelAQuadbike(model: Number): Boolean
    fun isThisModelATrain(model: Number): Boolean
    fun isVehicleInGarageArea(garageName: String, vehicle: Number): Boolean
    fun pausePlaybackRecordedVehicle(p0: Any)
    fun preloadVehicleMod(p0: Any, p1: Any, p2: Any)
    fun removeVehicleAsset(vehicleAsset: Number)
    fun removeVehicleRecording(p0: Any, p1: Any)
    fun removeVehiclesFromGeneratorsInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, unk: Any)
    fun removeVehicleStuckCheck(p0: Any)
    fun requestVehicleAsset(vehicleHash: Number, vehicleAsset: Number)
    fun requestVehicleRecording(p0: Any, p1: Any)
    fun setAllLowPriorityVehicleGeneratorsActive(active: Boolean)
    fun setAllVehicleGeneratorsActiveInArea(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, p6: Boolean, p7: Boolean)
    fun setCargobobHookPosition(p0: Any, p1: Number, p2: Number, p3: Boolean)
    fun setFarDrawVehicles(toggle: Boolean)
    fun setGarbageTrucks(toggle: Boolean): Any
    fun setMissionTrainAsNoLongerNeeded(train: Number, p1: Boolean): Number
    fun setNumberOfParkedVehicles(value: Number): Any
    fun setParkedVehicleDensityMultiplierThisFrame(multiplier: Number)
    fun setPlaybackSpeed(p0: Any, speed: Number): Any
    fun setPlaybackToUseAiTryToRevertBackLater(p0: Any, p1: Any, p2: Any, p3: Boolean)
    fun setRandomBoats(toggle: Boolean): Any
    fun setRandomTrains(toggle: Boolean)
    fun setRandomVehicleDensityMultiplierThisFrame(multiplier: Number)
    fun setScriptVehicleGenerator(vehicleGenerator: Any, enabled: Boolean)
    fun setVehicleDensityMultiplierThisFrame(multiplier: Number)
    fun setVehicleModelIsSuppressed(model: Number, suppressed: Boolean)
    fun setVehicleShootAtTarget(driver: Number, entity: Number, xTarget: Number, yTarget: Number, zTarget: Number)
    fun skipTimeInPlaybackRecordedVehicle(p0: Any, p1: Number)
    fun skipToEndAndStopPlaybackRecordedVehicle(p0: Any)
    fun startPlaybackRecordedVehicle(p0: Any, p1: Any, p2: Any, p3: Boolean)
    fun startPlaybackRecordedVehicleUsingAi(p0: Any, p1: Any, p2: Any, p3: Number, p4: Any)
    fun startPlaybackRecordedVehicleWithFlags(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any)
    fun stopPlaybackRecordedVehicle(p0: Any)
    fun switchTrainTrack(intersectionId: Number, state: Boolean): Any
    fun unpausePlaybackRecordedVehicle(p0: Any)
}

external interface MpGameWater {
    fun getWaterHeight(x: Number, y: Number, z: Number, height: Number): Number
    fun getWaterHeightNoWaves(x: Number, y: Number, z: Number, height: Number)
    fun modifyWater(x: Number, y: Number, radius: Number, height: Number)
    fun setWavesIntensity(intensity: Number)
    fun testProbeAgainstAllWater(startX: Number, startY: Number, startZ: Number, endX: Number, endY: Number, endZ: Number, p6: Any, p7s: Any): Boolean
    fun testProbeAgainstWater(startX: Number, startY: Number, startZ: Number, endX: Number, endY: Number, endZ: Number, p6: Boolean): Boolean
    fun testVerticalProbeAgainstAllWater(x: Number, y: Number, z: Number, p3: Any, p4: Any): Boolean
}

external interface MpGameWeapon {
    fun canUseWeaponOnParachute(weaponHash: Number): Boolean
    fun createWeaponObject(weaponHash: Number, ammoCount: Number, x: Number, y: Number, z: Number, showWorldModel: Boolean, heading: Number, p7: Any): Number
    fun doesWeaponTakeWeaponComponent(weaponHash: Number, componentHash: Number): Boolean
    fun enableLaserSightRendering(toggle: Boolean)
    fun getWeaponClipSize(weaponHash: Number): Number
    fun getWeaponComponentHudStats(p0: Any, p1: Any): Boolean
    fun getWeaponComponentTypeModel(componentHash: Number): Number
    fun getWeaponDamageType(weaponHash: Number): Number
    fun getWeaponHudStats(weaponHash: Number, data: MpWeaponHudStats): Boolean
    fun getWeaponObjectTintIndex(weapon: MpEntity): Number
    fun getWeaponTintCount(weaponHash: Number): Number
    fun getWeapontypeGroup(weaponHash: Number): Number
    fun getWeapontypeModel(weaponHash: Number): Number
    fun getWeapontypeSlot(weaponHash: Number): Number
    fun giveWeaponComponentToWeaponObject(weaponObject: Number, addonHash: Number)
    fun giveWeaponObjectToPed(weaponObject: Number, ped: Number)
    fun hasVehicleGotProjectileAttached(driver: Number, vehicle: Number, weapon: Number, p3: Any): Boolean
    fun hasWeaponAssetLoaded(weaponHash: Number): Boolean
    fun hasWeaponGotWeaponComponent(weapon: Number, addonHash: Number): Boolean
    fun isWeaponValid(weaponHash: Number): Boolean
    fun removeAllProjectilesOfType(weaponhash: Number, p1: Boolean)
    fun removeWeaponAsset(weaponHash: Number)
    fun removeWeaponComponentFromWeaponObject(p0: Any, p1: Any)
    fun requestWeaponAsset(weaponHash: Number, p1: Number, p2: Number)
    fun requestWeaponHighDetailModel(weaponObject: Number)
    fun setFlashLightFadeDistance(distance: Number)
    fun setPedAmmoToDrop(p0: Any, p1: Any)
    fun setWeaponObjectTintIndex(weapon: MpEntity, tint: Number)
}

external interface MpGameWorldprobe {
    fun castRayPointToPoint(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, flags: Number, ignoreEntity: MpEntity, p8: Number): Number
    fun getShapeTestResult(rayHandle: Number, hit: Boolean, endCoords: MpVector3, surfaceNormal: MpVector3, entityHit: MpEntity): MpRaycastResultHit
    fun getShapeTestResultEx(rayHandle: Number, hit: Boolean, endCoords: MpVector3, surfaceNormal: MpVector3, materialHash: Number, entityHit: MpEntity): MpRaycastResultHitMaterial
    fun startShapeTestBox(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, rotX: Number, rotY: Number, rotZ: Number, p9: Any, p10: Any, ignoreEntity: MpEntity, p12: Any): Number
    fun startShapeTestCapsule(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, radius: Number, flags: Number, ignoreEntity: MpEntity, p9: Number): Number
    fun startShapeTestLosProbe(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number, flags: Number, ignoreEntity: MpEntity, p8: Number): Number
}

external interface MpGameZone {
    fun clearPopscheduleOverrideVehicleModel(scheduleId: Number)
    fun getHashOfMapAreaAtCoords(x: Number, y: Number, z: Number): Number
    fun getHashOfMapAreaAtCoords(x: Number, y: Number, z: Number): String
    fun getZoneAtCoords(x: Number, y: Number, z: Number): Number
    fun getZoneFromNameId(zoneName: String): Number
    fun getZoneOfName(x: Number, y: Number, z: Number): String
    fun getZonePopschedule(zoneId: Number): Number
    fun getZoneScumminess(zoneId: Number): Number
    fun overridePopscheduleVehicleModel(scheduleId: Number, vehicleHash: Number)
    fun overridePopscheduleVehicleModel(scheduleId: Number, vehicleHash: String)
    fun setZoneEnabled(zoneId: Number, toggle: Boolean)
}



//
//
//      Pools
//
//

external interface MpBlipPool : MpPool<MpBlip> {
    fun new(sprite: Int, position: MpVector3, options: MpBlipOptions? = definedExternally): MpBlip
}

class MpBlipOptions {
    constructor(name: String? = "", scale: Number? = 1, color: Int? = 0, alpha: Int? = 255, drawDistance: Number? = 200, shortRange: Boolean? = false, rotation: MpVector3? = MpVector3(0,0,0), dimension: Int? = 0) {
        this.name = name
        this.scale = scale
        this.color = color
        this.alpha = alpha
        this.drawDistance = drawDistance
        this.shortRange = shortRange
        this.rotation = rotation
        this.dimension = dimension
    }

    var name: String?
    var scale: Number?
    var color: Int?
    var alpha: Int?
    var drawDistance: Number?
    var shortRange: Boolean?
    var rotation: MpVector3?
    var dimension: Int?
}

external interface MpBrowserPool : MpPool<MpBrowser> {
    fun new(url: String): MpBrowser
}

external interface MpCameraPool : MpPool<MpCamera> {
    fun new(name: String): MpCamera
}

external interface MpCheckpointPool : MpPool<MpCheckpoint> {
    fun new(type: Int, position: MpVector3, radius: Number, options: MpCheckpointOptions? = definedExternally): MpCheckpoint
}

class MpCheckpointOptions {
    constructor(direction: MpVector3? = MpVector3(0,0,0), color: MpRgb? = MpRgb(0,0,0), alpha: Int? = 0, visible: Boolean? = true, dimension: Int? = 0) {
        this.direction = direction
        this.color = color
        this.alpha = alpha
        this.visible = visible
        this.dimension = dimension
    }

    var direction: MpVector3?
    var color: MpRgb?
    var alpha: Int?
    var visible: Boolean?
    var dimension: Int?
}

external interface MpColshapePool : MpPool<MpColshape> {
    fun newCircle(x: Number, y: Number, range: Number): MpColshape
    fun newCuboid(x: Number, y: Number, z: Number, width: Number, depth: Number, height: Number): MpColshape
    fun newRectangle(x: Number, y: Number, width: Number, height: Number): MpColshape
    fun newSphere(x: Number, y: Number, z: Number, range: Number): MpColshape
    fun newTube(x: Number, y: Number, z: Number, range: Number, height: Number): MpColshape
}

external interface MpEventPool {
    fun add(eventName: String, callback: (args: Array<Any>?) -> Unit)
    fun addCommand(commandName: String, callback: (player: MpPlayer, fullText: String, args: Array<String>?) -> Unit)
    fun call(eventName: String, vararg args: Any?)
    fun call(eventName: String)
    fun callRemote(eventName: String, vararg args: Any?)
    fun callRemote(eventname: String)
    fun remove(eventName: String, handler: (args: Array<Any>?) -> Unit?)
    fun remove(eventNames: Array<String>)
}

external interface MpTextLabelPool {
    fun new(text: String, position: MpVector3, options: MpTextLabelOptions?): MpTextLabel
}

class MpTextLabelOptions {
    constructor(color: MpRgba? = MpRgba(), dimension: Int? = 0, drawDistance: Number? = 100, font: Int? = 0, los: Boolean? = false) {
        this.color = color
        this.dimension = dimension
        this.drawDistance = drawDistance
        this.font = font
        this.los = los
    }
    var color: MpRgba?
    var dimension: Int?
    var drawDistance: Number?
    var font: Int?
    var los: Boolean?
}

external interface MpMarkerPool : MpPool<MpMarker> {
    fun new(type: Int, position: MpVector3, scale: Number, options: MpMarkerOptions? = definedExternally)
}

class  MpMarkerOptions {
    constructor(direction: MpVector3? = MpVector3(0,0,0), rotation: MpVector3? = MpVector3(0,0,0), color: MpRgba? = MpRgba(), visible: Boolean? = true, dimension: Int? = 0) {
        this.direction = direction
        this.rotation = rotation
        this.color = color
        this.visible = visible
        this.dimension = dimension
    }

    var direction: MpVector3?
    var rotation: MpVector3?
    var color: MpRgba?
    var visible: Boolean?
    var dimension: Int?
}

external interface MpObjectPool : MpPool<MpObject> {
    fun new(model: Int, position: MpVector3, options: MpObjectOptions? = definedExternally)
}

class MpObjectOptions {
    constructor(alpha: Int? = 255, dimension: Int? = 0, rotation: MpVector3? = MpVector3(0,0,0)) {
        this.alpha = alpha
        this.dimension = dimension
        this.rotation = rotation
    }

    var alpha: Int?
    var dimension: Int?
    var rotation: MpVector3?
}

external interface MpPedPool : MpPool<MpPed> {
    fun new(model: Int, position: MpVector3, heading: Number, streamInEventHandler: (ped: MpPed) -> Unit?  = definedExternally, dimension: Int? = definedExternally)
}

external interface MpPickupPool : MpPool<MpPickup> {
    // Todo: Pickup constructor
    fun new(vararg args: Any): MpPickup
}

external interface MpPlayerPool : MpPool<MpPlayer> {
    val local: MpPlayer
}

external interface MpVehiclePool : MpPool<MpVehicle> {
    fun new(model: Int, position: MpVector3, options: MpVehicleOptions? = definedExternally)
}

class MpVehicleOptions {
    constructor(alpha: Int? = 255, color: Array<MpRgb>? = Array(2, { MpRgb(); MpRgb() }), dimension: Int? = 0, engine: Boolean? = true, heading: Number? = 0, locked: Boolean? = false, numberPlate: String? = "vanadium") {
        this.alpha = alpha
        this.color = color
        this.dimension = dimension
        this.engine = engine
        this.heading = heading
        this.locked = locked
        this.numberPlate = numberPlate
    }

    var alpha: Int?
    var color: Array<MpRgb>?
    var dimension: Int?
    var engine: Boolean?
    var heading: Number?
    var locked: Boolean?
    var numberPlate: String?
}



//
//
//      Types
//
//

external interface MpHeadBlend {
    var shapeFirstId: Int
    var shapeSecondID: Int
    var shapeThirdID: Int
    var skinFirstId: Int
    var skinSecondID: Int
    var skinThirdID: Int
    var shapeMix: Number
    var skinMix: Number
    var thirdMix: Number
}

external interface MpRaycastResult {
    var entity: MpEntity
    var position: MpVector3
    var surfaceNormal: MpVector3
}

class MpVector3 {
    constructor(x: Number, y: Number, z: Number) {
        this.x = x
        this.y = y
        this.z = z
    }

    var x: Number
    var y: Number
    var z: Number
}

class MpVector2 {
    constructor(x: Number, y: Number) {
        this.x = x
        this.y = y
    }

    var x: Number
    var y: Number
}

class MpQuaternion {
    constructor(x: Number, y: Number, z: Number, w: Number) {
        this.x = x
        this.y = y
        this.z = z
        this.w = w
    }

    var x: Number
    var y: Number
    var z: Number
    var w: Number
}



//
//
//      Additional Interfaces
//
//

class MpRgb {
    constructor(r: Int? = 0, g: Int? = 0, b: Int? = 0) {
        this.r = r
        this.g = g
        this.b = b
    }

    var r: Int?
    var g: Int?
    var b: Int?
}

class MpRgba {

    constructor(r: Int? = 0, g: Int? = 0, b: Int? = 0, a: Int? = 0) {
        this.r = r
        this.g = g
        this.b = b
        this.a = a
    }

    var r: Int?
    var g: Int?
    var b: Int?
    var a: Int?
}

class MpVehicleColors {
    constructor(primary: Int? = 0, secondary: Int? = 0) {
        colorPrimary = primary
        colorSecondary = secondary
    }

    var colorPrimary: Int?
    var colorSecondary: Int?
}

class MpVehicleExtraColors {
    constructor(pearlescent: Int? = 0, wheel: Int? = 0) {
        pearlescentColor = pearlescent
        wheelColor = wheel
    }

    var pearlescentColor: Int?
    var wheelColor: Int?
}

class MpVehicleLightState {
    constructor(lights: Boolean? = false, highbeams: Boolean? = false) {
        lightsOn = lights
        highbeamsOn = highbeams
    }

    var lightsOn: Boolean?
    var highbeamsOn: Boolean?
}
class MpVehicleModColor {
    constructor(paintType: Int? = 0, color: Int? = 0, p2: Int? = 0) {
        this.paintType = paintType
        this.color = color
        this.p2 = p2
    }

    var paintType: Int?
    var color: Int?
    var p2: Int?
}

external enum class ForceType {
    MinForce,
    MaxForceRot,
    MinForce2,
    MaxForceRot2,
    ForceNoRot,
    ForceRotPlusForce
}

external interface MpWeaponComponentDataPointer {
    var attachBone: Int
    var padding1: Number
    var bActiveByDefault: Number
    var padding2: Number
    var unk: Number
    var padding3: Number
    var componentHash: Number
    var padding4: Number
    var unk2: Number
    var padding5: Number
    var componentCost: Number
    var padding6: Number
    var nameLabel: String
    var descLabel: String
}

external interface  MpWeaponDataPointer {
    var emptyCheck: Number
    var padding1: Number
    var weaponHash: Number
    var padding2: Number
    var unk: Number
    var padding3: Number
    var weaponCost: Number
    var padding4: Number
    var ammoCost: Number
    var padding5: Number
    var ammoType: Number
    var padding6: Number
    var defaultClipSize: Number
    var padding7: Number
    var nameLabel: String
    var descLabel: String
    var desc2Label: String
    var upperCaseNameLabel: String
}

external interface  MpShopPedOutfit {
    var mask: Number
    var torso: Number
    var pants: Number
    var parachute: Number
    var shoes: Number
    var misc1: Number
    var tops1: Number
    var armour: Number
    var crew: Number
    var tops2: Number
    var hat: Number
    var glasses: Number
    var earpiece: Number
    var maskTexture: Number
    var torsoTexture: Number
    var pantsTexture: Number
    var parachuteTexture: Number
    var shoesTexture: Number
    var misc1Texture: Number
    var tops1Texture: Number
    var armourTexture: Number
    var crewTexture: Number
    var tops2Texture: Number
    var hatTexture: Number
    var glassesTexture: Number
    var earpiceTexture: Number
}

class MpMinimumMaximumVector {
    constructor(min: MpVector3, max: MpVector3) {
        minimum = min
        maximum = max
    }

    var minimum: MpVector3
    var maximum: MpVector3
}

class MpFontData {
    constructor(font: Int? = 0, color: MpRgba? = MpRgba(), scale: MpVector2? = MpVector2(1,1), outline: Boolean? = false) {
        this.font = font
        this.color = color
        this.scale = scale
        this.outline = outline
    }

    var font: Int?
    var color: MpRgba?
    var scale: MpVector2?
    var outline: Boolean?
}

external interface MpDoorState {
    var locked: Boolean
    var heading: Boolean
}

external interface  MpDirections {
    var p4: Number
    var vehicle: Number
    var p6: Number
}

external interface  MpVehicleNode {
    var outPosition: MpVector3
    var outHeading: Number
}

external interface  MpVehicleNode2 {
    var outPosition: MpVector3
    var heading: Number
    var unknown1: Any
}

external interface  MpStreetName {
    var streetName: Number
    var crossingRoad: Number
}

external interface  MpVehicleNodeProperties {
    var density: Number
    var flags: Number
}

external interface  MpDateTime {
    var year: Number
    var month: Number
    var day: Number
    var hour: Number
    var minute: Number
    var second: Number
    var milisecond: Number
}

external interface  MpDateTime2 {
    var year: Number
    var month: Number
    var day: Number
    var hour: Number
    var minute: Number
    var second: Number
}

interface MpHudColor {
    var hudIndex: Number
    var r: Number
    var g: Number
    var b: Number
    var a: Number
}

external interface  MpRandomVehicleModelInMemory {
    var modelHash: Number
    var p2: Number
}

external interface  MpWeaponHudStats {
    var hudDamage: Number
    var hudSpeed: Number
    var hudCapacity: Number
    var hudAccuracy: Number
    var hudRange: Number
}

external interface  MpRaycastResultHit {
    var hit: Boolean
    var endCoords: MpVector3
    var surfaceNormal: MpVector3
    var entityHit: MpEntity
}

external interface  MpRaycastResultHitMaterial {
    var hit: Boolean
    var endCoords: MpVector3
    var surfaceNormal: MpVector3
    var materialHash: Int
    var entityHit: MpVector3
}