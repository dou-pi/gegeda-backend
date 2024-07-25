package com.doupi.gegeda.scoring;

import com.doupi.gegeda.model.entity.App;
import com.doupi.gegeda.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 *
* @author 豆皮
 */
public interface ScoringStrategy {

    /**
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}