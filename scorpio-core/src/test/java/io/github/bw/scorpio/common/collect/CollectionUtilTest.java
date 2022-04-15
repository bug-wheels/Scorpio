package io.github.bw.scorpio.common.collect;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("集合工具测试")
class CollectionUtilTest {

  @Test
  void isNotEmpty() {

    Assertions.assertFalse(CollectionUtil.isNotEmpty(new ArrayList<String>()));
    Assertions.assertFalse(CollectionUtil.isNotEmpty(new HashMap<String, String>()));
    Assertions.assertFalse(CollectionUtil.isNotEmpty(new HashSet<String>()));

    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("1");
    Assertions.assertTrue(CollectionUtil.isNotEmpty(stringList));

    Set<String> stringSet = new HashSet<>();
    stringSet.add("1");
    Assertions.assertTrue(CollectionUtil.isNotEmpty(stringSet));

    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("dd", "d");
    Assertions.assertTrue(CollectionUtil.isNotEmpty(stringMap));

  }

  @Test
  void isEmpty() {
    Assertions.assertTrue(CollectionUtil.isEmpty(new ArrayList<String>()));
    Assertions.assertTrue(CollectionUtil.isEmpty(new HashMap<String, String>()));
    Assertions.assertTrue(CollectionUtil.isEmpty(new HashSet<String>()));

    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("1");
    Assertions.assertFalse(CollectionUtil.isEmpty(stringList));

    Set<String> stringSet = new HashSet<>();
    stringSet.add("1");
    Assertions.assertFalse(CollectionUtil.isEmpty(stringSet));

    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("dd", "d");
    Assertions.assertFalse(CollectionUtil.isEmpty(stringMap));
  }


  @Test
  void getFirstElseNull() {
    Assertions.assertNull(CollectionUtil.getFirstElseNull(null));

    List<String> stringList = new ArrayList<>();
    Assertions.assertNull(CollectionUtil.getFirstElseNull(stringList));
    stringList.add("dd");
    Assertions.assertEquals("dd", CollectionUtil.getFirstElseNull(stringList));
    stringList.add(0, "aa");
    Assertions.assertEquals("aa", CollectionUtil.getFirstElseNull(stringList));
    stringList.add(0, null);
    Assertions.assertNull(CollectionUtil.getFirstElseNull(stringList));
  }

  @Test
  void getLastElseNull() {
    Assertions.assertNull(CollectionUtil.getLastElseNull(null));

    List<String> stringList = new ArrayList<>();
    Assertions.assertNull(CollectionUtil.getFirstElseNull(stringList));
    stringList.add("dd");
    Assertions.assertEquals("dd", CollectionUtil.getFirstElseNull(stringList));
    stringList.add(0, "aa");
    Assertions.assertEquals("aa", CollectionUtil.getFirstElseNull(stringList));
    stringList.add(0, null);
    Assertions.assertNull(CollectionUtil.getFirstElseNull(stringList));
  }
}