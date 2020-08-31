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
package org.pdbcorp.easp.alawal.service.generate.impl;

import org.apache.commons.lang3.StringUtils;
import org.pdbcorp.easp.alawal.domain.model.Address;
import org.pdbcorp.easp.alawal.service.generate.GenerateNodeUidService;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author jaradat-pdb
 */
@Service
@Slf4j
class AddressNodeUidGeneratorService implements GenerateNodeUidService<Address> {

	public String generateNodeUid(Address entity) {
		if(log.isTraceEnabled()) {
			log.trace("Generating nodeUid for entity: {}", entity);
		}
		
		String nodeUid = "";
		if(entity != null) {
			nodeUid = constructNodeUid(entity);
			if(log.isDebugEnabled()) {
				log.debug("Generated nodeUid [{}] for entity: {}", nodeUid, entity);
			}
		}
		else {
			log.warn("Returning empty nodeUid for entity: {}", entity);
		}
		
		return nodeUid;
	}

	private String constructNodeUid(Address entity) {
		if(!StringUtils.isBlank(entity.getAddrLine1())) {
			StringBuilder sb = new StringBuilder();
			sb.append(entity.getAddrLine1());
			if(!StringUtils.isBlank(entity.getAddrLine2()))
				sb.append(", ").append(entity.getAddrLine2());
			if(!StringUtils.isBlank(entity.getAddrLine3()))
				sb.append(", ").append(entity.getAddrLine3());
			if(!StringUtils.isBlank(entity.getCity()))
				sb.append(", ").append(entity.getCity());
			if(!StringUtils.isBlank(entity.getState()))
				sb.append(", ").append(entity.getState());
			if(!StringUtils.isBlank(entity.getProvince()))
				sb.append(", ").append(entity.getProvince());
			if(!StringUtils.isBlank(entity.getCountry()))
				sb.append(", ").append(entity.getCountry());
			if(!StringUtils.isBlank(entity.getPostalCode()))
				sb.append(", ").append(entity.getPostalCode());
			return sb.toString();
		}
		else {
			return entity.toString();
		}
	}

}
