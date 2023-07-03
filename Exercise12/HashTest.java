import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HashTest {

	@Test
	public void testHashTableOverflow() {
		HashTableOverflow table = new HashTableOverflow();
		KeyValue data1 = new KeyValue(1, "value1");
		KeyValue data2 = new KeyValue(2, "value2");
		KeyValue data3 = new KeyValue(8, "value3");
		KeyValue data4 = new KeyValue(15, "value4");
		KeyValue data5 = new KeyValue(22, "value5");
		KeyValue data6 = new KeyValue(29, "value6");
		KeyValue data7 = new KeyValue(36, "value7");
		KeyValue data8 = new KeyValue(43, "value8");

		assertEquals(true, table.add(data1));
		assertEquals(true, table.add(data2));
		assertEquals(true, table.add(data3));
		assertEquals(true, table.add(data4));
		assertEquals(true, table.add(data5));
		assertEquals(true, table.add(data6));
		assertEquals(true, table.add(data7));
		assertEquals(true, table.add(data8));
		assertEquals("value1", table.get(1).getValue());
		assertEquals("value2", table.get(2).getValue());
		assertEquals("value3", table.get(8).getValue());
		assertEquals("value4", table.get(15).getValue());
		assertEquals("value5", table.get(22).getValue());
		assertEquals("value6", table.get(29).getValue());
		assertEquals("value7", table.get(36).getValue());
		assertEquals("value8", table.get(43).getValue());
		assertNull(table.get(50));
	}

	@Test
	public void testHashTableOpen() {
		HashTableOpen table = new HashTableOpen();
		KeyValue data1 = new KeyValue(1, "value1");
		KeyValue data2 = new KeyValue(2, "value2");
		KeyValue data3 = new KeyValue(8, "value3");
		KeyValue data4 = new KeyValue(15, "value4");
		KeyValue data5 = new KeyValue(22, "value5");
		KeyValue data6 = new KeyValue(29, "value6");
		KeyValue data7 = new KeyValue(36, "value7");
		KeyValue data8 = new KeyValue(43, "value8");

		assertEquals(true, table.add(data1));
		assertEquals(true, table.add(data2));
		assertEquals(true, table.add(data3));
		assertEquals(true, table.add(data4));
		assertEquals(true, table.add(data5));
		assertEquals(true, table.add(data6));
		assertEquals(true, table.add(data7));
		assertEquals(true, table.add(data8));

		assertEquals("value1", table.get(1).getValue());
		assertEquals("value2", table.get(2).getValue());
		assertEquals("value3", table.get(8).getValue());
		assertEquals("value4", table.get(15).getValue());
		assertEquals("value5", table.get(22).getValue());
		assertEquals("value6", table.get(29).getValue());
		assertEquals("value7", table.get(36).getValue());
		assertEquals("value8", table.get(43).getValue());
		assertNull(table.get(50));
	}
}
