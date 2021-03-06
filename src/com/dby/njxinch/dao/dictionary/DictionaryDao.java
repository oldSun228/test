package com.dby.njxinch.dao.dictionary;

import com.dby.njxinch.model.DataDictionary;
import com.dby.njxinch.model.DictionaryCode;

import java.util.List;
import java.util.Map;

/**
 * Created by fgs on 2016/11/24.
 */
public interface DictionaryDao {

    /**
     * 获取字典树 数据
     * @return
     */
    List<DataDictionary> getDictionaryList();

    /**
     * 删除节点
     * @param params
     */
    void delDictionary(Map<String, Object> params);

    /**
     * 修改节点
     * @param params
     */
    void updateDictionaryData(Map<String, Object> params);

    /**
     * 新增节点
     * @param params
     */
    void saveDictionaryData(Map<String, Object> params);
}
