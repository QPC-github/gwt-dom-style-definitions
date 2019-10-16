/*
 * Copyright © 2019 The GWT Authors
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
package org.gwtproject.dom.style.shared;

/**
 * Enum for the 'text-transform' CSS property.
 */
public enum TextTransform implements HasCssName {
  CAPITALIZE {
    @Override
    public String getCssName() {
      return "capitalize";
    }
  },
  NONE {
    @Override
    public String getCssName() {
      return "none";
    }
  },
  LOWERCASE {
    @Override
    public String getCssName() {
      return "lowercase";
    }
  },
  UPPERCASE {
    @Override
    public String getCssName() {
      return "uppercase";
    }
  };

  @Override
  public abstract String getCssName();
}