/*
 * Copyright (C) 2016 Saxon State and University Library Dresden (SLUB)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.slub.nbnurn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NBNURNTest {

    @Test
    public void Returns_URN() throws Exception {
        NBNURN subject = new NBNURN("de", "bsz", "47110815");
        assertEquals("urn:nbn:de:bsz-47110815", subject.toURN().toString());
    }

}
