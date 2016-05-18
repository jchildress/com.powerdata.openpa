package com.powerdata.openpa.tools.psmfmt;
/*
 * Copyright (c) 2016, PowerData Corporation, Incremental Systems Corporation
 * All rights reserved.
 * Licensed under the BSD-3 Clause License.
 * See full license at https://powerdata.github.io/openpa/LICENSE.md
 */


public enum CaseNode implements VersionedDoc
{
	ID,Ang,Mag;

	@Override
	public String getVersion() {return "1.11";}
}
