/*
 * This file is part of CoAnSys project.
 * Copyright (c) 2012-2013 ICM-UW
 * 
 * CoAnSys is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * CoAnSys is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with CoAnSys. If not, see <http://www.gnu.org/licenses/>.
 */
package pl.edu.icm.coansys.commons.stringsimilarity;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author acz
 */
public class EditDistanceSimilarity extends SimilarityCalculator {

    private float approveLevel;
    private float disapproveLevel;

    public EditDistanceSimilarity(float approveLevel, float disapproveLevel) {
        if (approveLevel < 0.0 || approveLevel > 1.0 || disapproveLevel < 0.0 || disapproveLevel > 1.0) {
            throw new IllegalArgumentException("approveLevel and disapproveLevel must be between 0.0 and 1.0");
        }
        if (approveLevel >= disapproveLevel) {
            throw new IllegalArgumentException("disapproveLevel must be greater than approveLevel");
        }
        this.approveLevel = approveLevel;
        this.disapproveLevel = disapproveLevel;
    }



    @Override
    protected float doCalculate(String s1, String s2) {

        int levenshteinDistance = StringUtils.getLevenshteinDistance(s1, s2);
        int maxLength = Math.max(s1.length(), s2.length());

        if (maxLength == 0) {
            return 1.0f;
        } else if (levenshteinDistance > disapproveLevel * maxLength) {
            return 0.0f;
        } else if (levenshteinDistance < approveLevel * maxLength) {
            return 1.0f;
        } else {
            return (disapproveLevel * maxLength - levenshteinDistance) / ((disapproveLevel - approveLevel) * maxLength);
        }
    }

}
