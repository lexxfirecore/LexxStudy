// -----------------------------------------------------------------------------
//  Copyright (c) Edifecs Inc. All Rights Reserved.
//
// This software is the confidential and proprietary information of Edifecs Inc.
// ("Confidential Information").  You shall not disclose such Confidential
// Information and shall use it only in accordance with the terms of the license
// agreement you entered into with Edifecs.
//
//
// EDIFECS MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
// NON-INFRINGEMENT. EDIFECS SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
// LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR
// ITS DERIVATIVES.
// -----------------------------------------------------------------------------

package com.lexxstudy.security;

/**
 * This class contains
 *
 * @author Alexandru Corghencea <a href="c-alexandru.corghencea@edifecs.com">
 *         c-alexandru.corghencea@edifecs.com</a>
 */

public class ExceptionMessage {
    public static final String PARAM_WRONG = "One of parameters encryption parameters are not set properly.";
    public static final String KEYS_BAD_LOCATION_OR_WRONG_PATH = "Couldn't retrieve keys. Check location settings.";
    public static final String KEYS_COULD_NOT_RETRIEVE = "Couldn't retrieve keys. Check location settings.";
    public static final String KEYS_BAD_PASSWORD = "Keystore password was incorrect.";
    public static final String KEYS_BAD_SECRET = "Cannot recover key";
}
