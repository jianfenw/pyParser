from datetime import time

def color_time(Color=None, Time=None):
	print("Color:", Color, "Time:", Time)
	Color, Hour, Period = Color[0], int(Time[0]), Time[1]
	if Period == 'pm':
		Hour += 12

	Time = time(hour=Hour)
	return Color, Time

functions = {
	'BasicColorTime' : color_time,
}
