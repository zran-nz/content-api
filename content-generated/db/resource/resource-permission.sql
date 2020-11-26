
                INSERT INTO permission (id, version, auth_key, auth_uris, entity, http_method, creator_id, modifier_id)
                VALUES (50101,0,'Index Resource','/v[\\d]+/resource','Resource','GET',1, 1);
                

                INSERT INTO permission (id, version, auth_key, auth_uris, entity, http_method, creator_id, modifier_id)
                VALUES (50102,0,'Create Resource','/v[\\d]+/resource','Resource','POST',1, 1);
                

                INSERT INTO permission (id, version, auth_key, auth_uris, entity, http_method, creator_id, modifier_id)
                VALUES (50103,0,'Read Resource','/v[\\d]+/resource/[\\d]+','Resource','GET',1, 1);
                

                INSERT INTO permission (id, version, auth_key, auth_uris, entity, http_method, creator_id, modifier_id)
                VALUES (50104,0,'Update Resource','/v[\\d]+/resource/[\\d]+','Resource','PUT',1, 1);
                

                INSERT INTO permission (id, version, auth_key, auth_uris, entity, http_method, creator_id, modifier_id)
                VALUES (50105,0,'Delete a Resource','/v[\\d]+/resource/[\\d]+','Resource','DELETE',1, 1);
                

                INSERT INTO permission (id, version, auth_key, auth_uris, entity, http_method, creator_id, modifier_id)
                VALUES (50106,0,'Delete all Resource','/v[\\d]+/resource/clear','Resource','DELETE',1, 1);
                

                INSERT INTO permission (id, version, auth_key, auth_uris, entity, http_method, creator_id, modifier_id)
                VALUES (50107,0,'Excel Resource','/v[\\d]+/resource/excel','Resource','GET',1, 1);
                
