/*******************************************************************************
* Copyright (c) 2015 ARM Ltd. and others
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* ARM Ltd and ARM Germany GmbH - Initial API and implementation
*******************************************************************************/

package com.arm.cmsis.pack.data;

import java.util.Collection;
import java.util.Set;

/**
 * Represents CMISIS Pack meta data read from pdsc file
 * Provides access method to underlying structure of the Pack
 */
public interface ICpPack extends ICpRootItem {

	/**
	 * Describes Pack state:
	 * <dl>
	 * 	<dd>INSTALLED  pack is locally installed
		<dd>DOWNLOADED pack is download, but not installed
		<dd>AVAILABLE  pack is available for download
		<dd>GENERATED  generator pack read from gpdsc file
		<dd>UNKNOWN    pack state is not defined
		<dd>ERROR 	   pack has error
	 * </dl>
	 *
	 *
	 */
	enum PackState {
		INSTALLED,
		DOWNLOADED,
		AVAILABLE,
		GENERATED,
		UNKNOWN,
		ERROR
	}


	/**
	 * Sets pack state
	 * @return <code>PackState<code> of the Pack
	 * @see PackState
	 */
	PackState getPackState();

	/**
	 * Returns pack state
	 * @param state PackState to set
	 * @see PackState
	 */
	void setPackState(PackState state);

	/**
	 * Returns absolute path to directory where pack is or must be installed
	 * @return absolute path to the pack
	 */
	String getInstallDir(String packRoot);

	/**
	 * Returns condition corresponding to supplied ID
	 * @param conditionId id of the condition to find
	 * @return condition as ICpItem or null if condition with such id does not exist in the pack
	 */
	ICpItem getCondition(String conditionId);

	/**
	 * Returns generator corresponding to supplied id if any
	 * @param id name of the generator to find. If null or empty the first generator is returned  (gpdsc case)
	 * @return generator as ICpGenerator or null if not found in the pack
	 */
	ICpGenerator getGenerator(String id);


	/**
	 * Get names of all devices declared in the pack
	 * @return a set of device names, includes family, sub-family, device and variant levels.
	 */
	Set<String> getAllDeviceNames();

	/**
	 * Get names of boards described in the pack
	 * @return a set of boar names
	 */
	Set<String> getBoardNames();


	/**
	 * Check if this pack is generic or not
	 * @return true if this pack is generic
	 */
	boolean isDevicelessPack();

	/**
	 * @return true if this pack is the latest version
	 */
	boolean isLatest();

	/**
	 * Check if the required packs of this packs are all installed
	 * @return true if the required packs are all installed
	 */
	boolean isRequiredPacksInstalled();

	/**
	 * Returns collection of Pack releases (from latest to oldest)
	 * @return collection of ICpItem representing pack releases
	 */
	Collection<? extends ICpItem> getReleases();

	/**
	 * Returns collection of required packs of this pack
	 * @return collection of required packs of this pack
	 */
	Collection<? extends ICpItem> getRequiredPacks();
}
