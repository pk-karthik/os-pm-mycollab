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
package com.mycollab.module.tracker.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.tracker.domain.BugExample;
import com.mycollab.module.tracker.domain.BugWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface BugMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    long countByExample(BugExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    int deleteByExample(BugExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    int insert(BugWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    int insertSelective(BugWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    List<BugWithBLOBs> selectByExampleWithBLOBs(BugExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    BugWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    int updateByExampleSelective(@Param("record") BugWithBLOBs record, @Param("example") BugExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    int updateByExampleWithBLOBs(@Param("record") BugWithBLOBs record, @Param("example") BugExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    int updateByPrimaryKeySelective(BugWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    int updateByPrimaryKeyWithBLOBs(BugWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    Integer insertAndReturnKey(BugWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug
     *
     * @mbg.generated Sun Dec 25 21:30:10 ICT 2016
     */
    void massUpdateWithSession(@Param("record") BugWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}