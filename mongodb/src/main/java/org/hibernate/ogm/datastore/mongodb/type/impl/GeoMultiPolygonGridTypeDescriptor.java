/*
 * Hibernate OGM, Domain model persistence for NoSQL datastores
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.ogm.datastore.mongodb.type.impl;

import org.hibernate.ogm.datastore.mongodb.type.GeoMultiPolygon;

/**
 * Persists {@link GeoMultiPolygon} in the format expected by MongoDB.
 *
 * @author Guillaume Smet
 */
public class GeoMultiPolygonGridTypeDescriptor extends AbstractGeoJsonObjectGridTypeDescriptor<GeoMultiPolygon> {

	public static final GeoMultiPolygonGridTypeDescriptor INSTANCE = new GeoMultiPolygonGridTypeDescriptor();

	private GeoMultiPolygonGridTypeDescriptor() {
		super( GeoMultiPolygon.class, GeoMultiPolygon::fromDocument );
	}
}
