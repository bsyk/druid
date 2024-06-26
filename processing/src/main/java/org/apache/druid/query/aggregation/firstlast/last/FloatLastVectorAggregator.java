/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.druid.query.aggregation.firstlast.last;

import org.apache.druid.query.aggregation.firstlast.FloatFirstLastVectorAggregator;
import org.apache.druid.query.aggregation.firstlast.SelectionPredicate;
import org.apache.druid.segment.vector.VectorObjectSelector;
import org.apache.druid.segment.vector.VectorValueSelector;

public class FloatLastVectorAggregator extends FloatFirstLastVectorAggregator
{

  public FloatLastVectorAggregator(VectorValueSelector timeSelector, VectorObjectSelector objectSelector)
  {
    super(timeSelector, objectSelector, SelectionPredicate.LAST_PREDICATE);
  }

  public FloatLastVectorAggregator(VectorValueSelector timeSelector, VectorValueSelector valueSelector)
  {
    super(timeSelector, valueSelector, SelectionPredicate.LAST_PREDICATE);
  }
}
