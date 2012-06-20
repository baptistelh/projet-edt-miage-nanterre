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
    
    /**
     * @cfg {Number} dayCount
     * The number of days to display in the view (defaults to 7)
     */
    // These settings create a fixed weekday view. 
    // This view will only show Mon-Fri.
    dayCount: 5,
    // Always start the view on Monday
    startDay: 1,
    startDayIsStatic: true,
    
    // NOTE: the configs below apply to any DayView or WeekView. If you wanted all day
    // and week views to share these same settings, you could simply pass these configs
    // in the general viewCfg. Any views that do not use them will ignore them. They are
    // only on this view in this sample to demonstrate how they can be easily customized per view.
    
    // Hide the half-hour marker line
    showHourSeparator: false,
    // Start the view at 6:00
    viewStartHour: 6,
    // End the view at 8:00pm / 20:00
    viewEndHour: 20,
    // Default the scroll position on load to 8:00 if the body is overflowed
    scrollStartHour: 8,
    // Customize the hour (and event) heights. See the docs for details on setting this.
    // This example will be double-height (the default is 42)
    hourHeight: 84,
    // Allow drag-drop, drag-create and resize of events in 10-minute increments
    ddIncrement: 10,
    // Since the hour blocks are double-height, we can shorten the minimum event display 
    // height to match the ddIncrement
    minEventDisplayMinutes: 10
});