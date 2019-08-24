package person.sa.dao;

import person.sa.dataobject.SequenceDO;

public interface SequenceDOMapper {
    SequenceDO getSequenceByName(String name);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Jun 18 19:22:23 CST 2019
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Jun 18 19:22:23 CST 2019
     */
    int insert(SequenceDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Jun 18 19:22:23 CST 2019
     */
    int insertSelective(SequenceDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Jun 18 19:22:23 CST 2019
     */
    SequenceDO selectByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Jun 18 19:22:23 CST 2019
     */
    int updateByPrimaryKeySelective(SequenceDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Jun 18 19:22:23 CST 2019
     */
    int updateByPrimaryKey(SequenceDO record);
}