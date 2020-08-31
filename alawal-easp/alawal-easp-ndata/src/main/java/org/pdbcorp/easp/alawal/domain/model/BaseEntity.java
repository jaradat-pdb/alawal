/*
 * Copyright 2020 PDB Corp.
 *
 * Proprietary Software built off of open-source software?
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pdbcorp.easp.alawal.domain.model;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Property;
import org.neo4j.springframework.data.core.support.UUIDStringGenerator;

/**
 * 
 * @author jaradat-pdb
 */
public abstract class BaseEntity {

	@Id
	@GeneratedValue(UUIDStringGenerator.class)
	private String id;

	@Property(name = "NODE_UID")
	private String nodeUid;

	/**
	 * 
	 * @return String - the id value of this node object (i.e. the id of this node in the datastore).
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @return String - the nodeUid value of this node object.
	 */
	public String getNodeUid() {
		return nodeUid;
	}

	/**
	 * 
	 * @param nodeUid - the nodeUid value to set for this node object.
	 */
	public void setNodeUid(String nodeUid) {
		this.nodeUid = nodeUid;
	}

}
