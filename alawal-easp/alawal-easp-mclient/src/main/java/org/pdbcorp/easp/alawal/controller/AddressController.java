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
package org.pdbcorp.easp.alawal.controller;

import org.pdbcorp.easp.alawal.domain.model.Address;
import org.pdbcorp.easp.alawal.domain.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 
 * @author jaradat-pdb
 */
@Controller
@RequestMapping(path = "/addresses")
public class AddressController {

	private AddressRepository addressRepository;

	@Autowired
	AddressController(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@PostMapping
	public @ResponseBody Mono<Address> addAddress(@RequestBody Address address) {
		return addressRepository.save(address);
	}

	@GetMapping
	public @ResponseBody Flux<Address> getAllAddresses() {
		return addressRepository.findAll();
	}

}
