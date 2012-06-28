/**
 * @class Ext.calendar.view.Week
 * @extends Ext.calendar.DayView
 * <p>Displays a calendar view by week. This class does not usually need ot be used directly as you can
 * use a {@link Ext.calendar.CalendarPanel CalendarPanel} to manage multiple calendar views at once including
 * the week view.</p>
 * @constructor
 * @param {Object} config The config object
 */
Ext.define('Ext.calendar.view.Week', {
    extend: 'Ext.calendar.view.Day',
    alias: 'widget.weekview',
    
    dayCount: 7,
});