package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Item;

public interface ItemRepository {

  Item get(int id);

  boolean create(Item item);

  boolean update(Item item);

  boolean delete(int id);

  boolean createOrUpdate(Item item);

}
