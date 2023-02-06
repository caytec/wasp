/*
 * Copyright (c) 1997-2020 Oracle and/or its affiliates. All rights reserved.
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.glassfish.wasp.taglibs.standard.tag.rt.fmt;

import org.glassfish.wasp.taglibs.standard.tag.common.fmt.MessageSupport;

import jakarta.servlet.jsp.JspTagException;
import jakarta.servlet.jsp.jstl.fmt.LocalizationContext;

/**
 * A handler for &lt;message&gt; that supports rtexprvalue-based attributes.
 *
 * @author Jan Luehe
 */

public class MessageTag extends MessageSupport {

    private static final long serialVersionUID = 1L;

    // *********************************************************************
    // Accessor methods

    // for tag attribute
    public void setKey(String key) throws JspTagException {
        this.keyAttrValue = key;
        this.keySpecified = true;
    }

    // for tag attribute
    public void setBundle(LocalizationContext locCtxt) throws JspTagException {
        this.bundleAttrValue = locCtxt;
        this.bundleSpecified = true;
    }
}
