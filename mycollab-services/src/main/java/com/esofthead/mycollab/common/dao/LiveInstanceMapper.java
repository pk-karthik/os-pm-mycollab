/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.common.dao;

import com.esofthead.mycollab.common.domain.LiveInstance;
import com.esofthead.mycollab.common.domain.LiveInstanceExample;
import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface LiveInstanceMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int countByExample(LiveInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int deleteByExample(LiveInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int insert(LiveInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int insertSelective(LiveInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    List<LiveInstance> selectByExample(LiveInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    LiveInstance selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int updateByExampleSelective(@Param("record") LiveInstance record, @Param("example") LiveInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int updateByExample(@Param("record") LiveInstance record, @Param("example") LiveInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int updateByPrimaryKeySelective(LiveInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int updateByPrimaryKey(LiveInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    Integer insertAndReturnKey(LiveInstance value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    void massUpdateWithSession(@Param("record") LiveInstance record, @Param("primaryKeys") List primaryKeys);
}