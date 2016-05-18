package com.powerdata.openpa.tools.psmfmt;
/*
 * Copyright (c) 2016, PowerData Corporation, Incremental Systems Corporation
 * All rights reserved.
 * Licensed under the BSD-3 Clause License.
 * See full license at https://powerdata.github.io/openpa/LICENSE.md
 */


public enum Switch implements VersionedDoc
{
	ID, Name, Node1, Node2, SwitchType;

	@Override
	public String getVersion() {return "1.10";}
}
