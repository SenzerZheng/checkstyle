////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001  Oliver Burn
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle;

/**
 * Represents a variable with an associated name, line number and modifiers.
 * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a>
 **/
public class MyVariable
    extends LineText
{
    /** the modifiers **/
    private final MyModifierSet mModifierSet;

    /** Constructs the object.
     * @param aName the name of the variable
     * @param aMods the modifiers for the variable
     **/
    public MyVariable(LineText aName, MyModifierSet aMods)
    {
        super(aName);
        mModifierSet = aMods;
    }

    /** @return the modifiers **/
    public MyModifierSet getModifierSet()
    {
        return mModifierSet;
    }
}
