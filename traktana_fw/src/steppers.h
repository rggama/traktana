#include "p30f3014.h"

#define STEPPERS_PORT LATB
#define HALF_MODE	0
#define FULL_MODE	1
#define COUNTER_CLOCK_WISE	0
#define CLOCK_WISE	1
//#define SENSORS

// Variables
int pos_stepper1 = 0;
int pos_stepper2 = 0;
const unsigned char step_full1[4]= {0b11110001,
									0b11110010,
									0b11110100,
									0b11111000};

const unsigned char step_half1[8] = {0b11110001,
									0b11110011,
									0b1111010,
									0b11110110,
									0b11110100,
									0b11111100,
									0b11111000,
									0b11111001};


/*const unsigned char step_full2[4]= {0b00011111,
									0b00101111,
									0b01001111,
									0b10001111};

const unsigned char step_half2[8]= {0b00011111,
									0b00111111,
									0b00101111,
									0b01101111,
									0b01001111,
									0b11001111,
									0b10001111,
									0b10011111};
*/
// Protoypes
void rotate_stepper1(unsigned long steps, unsigned char direction,
						unsigned int frequency, unsigned char mode);
void rotate_stepper2(unsigned long steps, unsigned char direction,
						unsigned int frequency, unsigned char mode);
