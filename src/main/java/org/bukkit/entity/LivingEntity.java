
package org.bukkit.entity;

import java.util.HashSet;
import java.util.List;
import org.bukkit.block.Block;

/**
 * Represents a living entity, such as a monster or player
 */
public interface LivingEntity extends Entity {
    /**
     * Gets the entity's health from 0-20, where 0 is dead and 20 is full
     *
     * @return Health represented from 0-20
     */
    public int getHealth();

    /**
     * Sets the entity's health from 0-20, where 0 is dead and 20 is full
     *
     * @param health New health represented from 0-20
     */
    public void setHealth(int health);

    /**
     * Gets the height of the entity's head above its Location
     *
     * @return Height of the entity's eyes above its Location
     */
    public double getEyeHeight();

    /**
     * Gets the height of the entity's head above its Location
     *
     * @param boolean If set to true, the effects of sneaking will be ignored
     * @return Height of the entity's eyes above its Location
     */
    public double getEyeHeight(boolean ignoreSneaking);

    /**
     * Gets all blocks along the player's line of sight
     * List iterates from player's position to target inclusive
     *
     * @param HashSet<Byte> HashSet containing all transparent block IDs. If set to null only air is considered transparent.
     * @param int This is the maximum distance to scan. This may be further limited by the server, but never to less than 100 blocks.
     * @return List containing all blocks along the player's line of sight
     */
    public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance);

     /**
     * Gets the block that the player has targeted
     *
     * @param HashSet<Byte> HashSet containing all transparent block IDs. If set to null only air is considered transparent.
     * @param int This is the maximum distance to scan. This may be further limited by the server, but never to less than 100 blocks.
     * @return Block that the player has targeted
     */
    public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance);

     /**
     * Gets the last two blocks along the player's line of sight.
     * The target block will be the last block in the list.
     *
     * @param HashSet<Byte> HashSet containing all transparent block IDs. If set to null only air is considered transparent.
     * @param int This is the maximum distance to scan. This may be further limited by the server, but never to less than 100 blocks
     * @return List containing the last 2 blocks along the player's line of sight
     */
    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance);

    /**
     * Throws an egg from the entity.
     */
    public Egg throwEgg();

    /**
     * Throws a snowball from the entity.
     */
    public Snowball throwSnowball();

    /**
     * Shoots an arrow from the entity.
     *
     * @return
     */
    public Arrow shootArrow();

    /**
     * Returns whether this entity is inside a vehicle.
     *
     * @return
     */
    public boolean isInsideVehicle();

    /**
     * Leave the current vehicle. If the entity is currently in a vehicle
     * (and is removed from it), true will be returned, otherwise false will
     * be returned.
     *
     * @return
     */
    public boolean leaveVehicle();

    /**
     * Get the vehicle that this player is inside. If there is no vehicle,
     * null will be returned.
     *
     * @return
     */
    public Vehicle getVehicle();

    /**
     * Returns the amount of air that this entity has remaining, in ticks
     *
     * @return Amount of air remaining
     */
    public int getRemainingAir();

    /**
     * Sets the amount of air that this entity has remaining, in ticks
     *
     * @param ticks Amount of air remaining
     */
    public void setRemainingAir(int ticks);

    /**
     * Returns the maximum amount of air this entity can have, in ticks
     *
     * @return Maximum amount of air
     */
    public int getMaximumAir();

    /**
     * Sets the maximum amount of air this entity can have, in ticks
     *
     * @param ticks Maximum amount of air
     */
    public void setMaximumAir(int ticks);

    /**
     * Deals the given amount of damage to this entity
     *
     * @param amount Amount of damage to deal
     */
    public void damage(int amount);

    /**
     * Deals the given amount of damage to this entity, from a specified entity
     *
     * @param amount Amount of damage to deal
     * @param source Entity which to attribute this damage from
     */
    public void damage(int amount, Entity source);
}
