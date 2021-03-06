package wrx.xing.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/24.
 */
public class SqlTools {
    protected CustomColumn customColumn;

    protected String groupByClause;

    protected String orderByClause;

    /**
     * 分页类
     */
    protected PageHelper pageHelper;

    public PageHelper getPageHelper() {
        return pageHelper;
    }

    public void setPageHelper(PageHelper pageHelper) {
        this.pageHelper = pageHelper;
    }

    protected String tableName;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SqlTools() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public CustomColumn getCustomColumn() {
        return customColumn;
    }

    public void setCustomColumn(CustomColumn customColumn) {
        this.customColumn = customColumn;
    }

    public String getGroupByClause() {
        return groupByClause;
    }

    public void setGroupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        customColumn = null;
        groupByClause = null;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andColumnIsNull(String column) {
            addCriterion(column+" is null");
            return (Criteria) this;
        }

        public Criteria andColumnIsNotNull(String column) {
            addCriterion(column+" is not null");
            return (Criteria) this;
        }

        public Criteria andColumnEqualTo(String column,Object value) {
            addCriterion(column+" =", value, column);
            return (Criteria) this;
        }

        public Criteria andColumnNotEqualTo(String column,Object value) {
            addCriterion(column+" <>", value, column);
            return (Criteria) this;
        }

        public Criteria andColumnGreaterThan(String column,Object value) {
            addCriterion(column+" >", value, column);
            return (Criteria) this;
        }

        public Criteria andColumnGreaterThanOrEqualTo(String column,Object value) {
            addCriterion(column+" >=", value, column);
            return (Criteria) this;
        }

        public Criteria andColumnLessThan(String column,Object value) {
            addCriterion(column+" <", value, column);
            return (Criteria) this;
        }

        public Criteria andColumnLessThanOrEqualTo(String column,Object value) {
            addCriterion(column+" <=", value, column);
            return (Criteria) this;
        }

        public Criteria andColumnIn(String column,List<Object> values) {
            addCriterion(column+" in", values, column);
            return (Criteria) this;
        }

        public Criteria andColumnNotIn(String column,List<Object> values) {
            addCriterion(column+" not in", values, column);
            return (Criteria) this;
        }

        public Criteria andColumnBetween(String column,Object value1, Object value2) {
            addCriterion(column+" between", value1, value2, column);
            return (Criteria) this;
        }

        public Criteria andColumnNotBetween(String column,Object value1, Object value2) {
            addCriterion(column+" not between", value1, value2, column);
            return (Criteria) this;
        }

    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
