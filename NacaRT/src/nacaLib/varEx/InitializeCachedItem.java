/*
 * NacaRT - Naca RunTime for Java Transcoded Cobol programs.
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Publicitas SA.
 * Licensed under LGPL (LGPL-LICENSE.txt) license.
 */
/**
 * 
 */
package nacaLib.varEx;

/**
 *
 * @author Pierre-Jean Ditscheid, Consultas SA
 * @version $Id$
 */
public abstract class InitializeCachedItem
{
	abstract void apply(int nBaseAbsolutePosition, VarBufferPos varBufferPos, int nCurrentAbsolutePosition);	//, int nOffset);
}
