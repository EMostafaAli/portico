/*
 *   Copyright 2009 The Portico Project
 *
 *   This file is part of portico.
 *
 *   portico is free software; you can redistribute it and/or modify
 *   it under the terms of the Common Developer and Distribution License (CDDL) 
 *   as published by Sun Microsystems. For more information see the LICENSE file.
 *   
 *   Use of this software is strictly AT YOUR OWN RISK!!!
 *   If something bad happens you do not have permission to come crying to me.
 *   (that goes for your lawyer as well)
 *
 */
package org.portico.lrc.services.ownership.msg;

import java.util.Set;

import org.portico.utils.messaging.PorticoMessage;

/**
 * This message signals that the given attributes of the given object handle have been released
 * for ownership transfer (to whoever has requested them).
 * <p/>
 * This method has the <code>isImmediateProcessingRequired()</code> flag set to true.
 */
public class AttributeRelease extends PorticoMessage
{
	//----------------------------------------------------------
	//                    STATIC VARIABLES
	//----------------------------------------------------------
	private static final long serialVersionUID = 98121116105109L;

	//----------------------------------------------------------
	//                   INSTANCE VARIABLES
	//----------------------------------------------------------
	private int objectHandle;
	private Set<Integer> attributes;

	//----------------------------------------------------------
	//                      CONSTRUCTORS
	//----------------------------------------------------------
	public AttributeRelease( int objectHandle, Set<Integer> attributes )
	{
		super();
		this.objectHandle = objectHandle;
		this.attributes = attributes;
	}

	//----------------------------------------------------------
	//                    INSTANCE METHODS
	//----------------------------------------------------------
	@Override
	public boolean isImmediateProcessingRequired()
	{
		return true;
	}
	
	public int getObjectHandle()
	{
		return objectHandle;
	}

	public void setObjectHandle( int objectHandle )
	{
		this.objectHandle = objectHandle;
	}

	public Set<Integer> getAttributes()
	{
		return attributes;
	}

	public void setAttributes( Set<Integer> attributes )
	{
		this.attributes = attributes;
	}
	
	//----------------------------------------------------------
	//                     STATIC METHODS
	//----------------------------------------------------------
}
